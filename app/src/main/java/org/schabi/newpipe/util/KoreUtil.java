package org.schabi.newpipe.util;


import android.content.Context;
import android.content.DialogInterface;
import androidx.appcompat.app.AlertDialog;

import org.schabi.newpipe.R;


public class KoreUtil {
    private KoreUtil() { }

    public static void showInstallKoreDialog(final Context context) {
        final AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setMessage(R.string.kore_not_found)
               .setPositiveButton(R.string.install,
                   (DialogInterface dialog, int which) -> NavigationHelper.installKore(context))
               .setNegativeButton(R.string.cancel, (DialogInterface dialog, int which) -> {
               });
        builder.create().show();
    }
}
