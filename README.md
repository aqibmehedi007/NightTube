<h3 align="center">We are planning to <i>rewrite</i> large chunks of the codebase, to bring about <a href="https://github.com/TeamNightTube/NightTube/discussions/10118">a new, modern and stable NightTube</a>!</h3>
<h4 align="center">Please do <b>not</b> open pull requests for <i>new features</i> now, only bugfix PRs will be accepted.</h4>

<h2 align="center"><b>NightTube</b></h2>
<h4 align="center">A libre lightweight streaming front-end for Android.</h4>

<p align="center"><a href="https://f-droid.org/packages/org.schabi.nighttube/"><img src="https://fdroid.gitlab.io/artwork/badge/get-it-on-en.svg" alt="Get it on F-Droid" height=80/></a></p>

<p align="center">
<a href="https://github.com/TeamNightTube/NightTube/releases" alt="GitHub release"><img src="https://img.shields.io/github/release/TeamNightTube/NightTube.svg" ></a>
<a href="https://www.gnu.org/licenses/gpl-3.0" alt="License: GPLv3"><img src="https://img.shields.io/badge/License-GPL%20v3-blue.svg"></a>
<a href="https://github.com/TeamNightTube/NightTube/actions" alt="Build Status"><img src="https://github.com/TeamNightTube/NightTube/workflows/CI/badge.svg?branch=dev&event=push"></a>
<a href="https://hosted.weblate.org/engage/nighttube/" alt="Translation Status"><img src="https://hosted.weblate.org/widgets/nighttube/-/svg-badge.svg"></a>
<a href="https://web.libera.chat/#nighttube" alt="IRC channel: #nighttube"><img src="https://img.shields.io/badge/IRC%20chat-%23nighttube-brightgreen.svg"></a>
<a href="https://www.bountysource.com/teams/nighttube" alt="Bountysource bounties"><img src="https://img.shields.io/bountysource/team/nighttube/activity.svg?colorB=cd201f"></a>
</p>
<hr>
<p align="center"><a href="#screenshots">Screenshots</a> • <a href="#supported-services">Supported Services</a> • <a href="#description">Description</a> • <a href="#features">Features</a> • <a href="#installation-and-updates">Installation and updates</a> • <a href="#contribution">Contribution</a> • <a href="#donate">Donate</a> • <a href="#license">License</a></p>
<p align="center"><a href="https://nighttube.net">Website</a> • <a href="https://nighttube.net/blog/">Blog</a> • <a href="https://nighttube.net/FAQ/">FAQ</a> • <a href="https://nighttube.net/press/">Press</a></p>
<hr>

*Read this in other languages: [English](README.md), [Español](doc/README.es.md), [हिन्दी](doc/README.hi.md), [한국어](doc/README.ko.md), [Soomaali](doc/README.so.md), [Português Brasil](doc/README.pt_BR.md), [Polski](doc/README.pl.md), [日本語](doc/README.ja.md), [Română](doc/README.ro.md), [Türkçe](doc/README.tr.md), [正體中文](doc/README.zh_TW.md).*

<b>WARNING: THIS APP IS IN BETA, SO YOU MAY ENCOUNTER BUGS. IF YOU DO, OPEN AN ISSUE IN OUR GITHUB REPOSITORY BY FILLING OUT THE ISSUE TEMPLATE.</b>

<b>PUTTING NIGHTTUBE, OR ANY FORK OF IT, INTO THE GOOGLE PLAY STORE VIOLATES THEIR TERMS AND CONDITIONS.</b>

## Screenshots

*(screenshots kept same paths for now — update if you rename assets)*

[<img src="fastlane/metadata/android/en-US/images/phoneScreenshots/shot_01.png" width=160>](fastlane/metadata/android/en-US/images/phoneScreenshots/shot_01.png)
...

### Supported Services

NightTube currently supports these services:

* YouTube ([website](https://www.youtube.com/)) and YouTube Music ([website](https://music.youtube.com/))
* PeerTube ([website](https://joinpeertube.org/)) and its instances
* Bandcamp ([website](https://bandcamp.com/))
* SoundCloud ([website](https://soundcloud.com/))
* media.ccc.de ([website](https://media.ccc.de/))

As you can see, NightTube supports multiple video and audio services. Though it started off with YouTube, other people have added more services over the years, making NightTube more versatile!

If you intend to add a new service, please get in touch first! Docs: [NightTube Extractor](https://github.com/TeamNightTube/NightTubeExtractor).

## Description

NightTube works by fetching the required data from the official API (e.g. PeerTube) of the service you're using. If restricted (e.g. YouTube), the app parses the website or uses internal APIs.  
No accounts required.  
No proprietary Google Play Services dependencies.

### Features

* Watch videos up to 4K
* Listen in background (audio only)
* Picture-in-Picture
* Live streams
* Subtitles/CC
* Search (videos, channels, playlists, albums)
* Enqueue & playlists
* Channel subscriptions (without login!)
* Notifications for new uploads
* History, groups, feeds
* Local playlist support
* Download videos, audios, subtitles
* Open in Kodi
* Age-restricted content support

## Installation and updates

You can install NightTube via:

1. Add the custom repo to F-Droid and install. (instructions: https://nighttube.net/FAQ/tutorials/install-add-fdroid-repo/)  
2. Download APK from [GitHub Releases](https://github.com/TeamNightTube/NightTube/releases).  
3. Update via F-Droid (slower).  
4. Build a debug APK yourself.  
5. Download PR-specific APKs from GitHub Actions.

⚠️ Always back up data before switching sources.  

## Contribution

Help is always welcome — translations, bugfixes, design, features.  
See [Contribution Notes](.github/CONTRIBUTING.md).

<a href="https://hosted.weblate.org/engage/nighttube/">
<img src="https://hosted.weblate.org/widgets/nighttube/-/287x66-grey.png" alt="Translation status" />
</a>

## Donate

If you like NightTube, you can support development:  

<table>
  <tr>
    <td><a href="https://liberapay.com/TeamNightTube/"><img src="https://upload.wikimedia.org/wikipedia/commons/2/27/Liberapay_logo_v2_white-on-yellow.svg" width="80px" ></a></td>
    <td><a href="https://liberapay.com/TeamNightTube/"><img src="assets/liberapay_qr_code.png" width="100px"></a></td>
    <td><a href="https://liberapay.com/TeamNightTube/donate"><img src="assets/liberapay_donate_button.svg" height="35px"></a></td>
  </tr>
  <tr>
    <td><img src="https://bitcoin.org/img/icons/logotop.svg"></td>
    <td><img src="assets/bitcoin_qr_code.png" width="100px"></td>
    <td><samp>16A9J59ahMRqkLSZjhYj33n9j3fMztFxnh</samp></td>
  </tr>
  <tr>
    <td><a href="https://www.bountysource.com/teams/nighttube"><img src="https://upload.wikimedia.org/wikipedia/commons/thumb/2/22/Bountysource.png/320px-Bountysource.png" width="190px"></a></td>
    <td><a href="https://www.bountysource.com/teams/nighttube"><img src="assets/bountysource_qr_code.png" width="100px"></a></td>
    <td><a href="https://www.bountysource.com/teams/nighttube/issues"><img src="https://img.shields.io/bountysource/team/nighttube/activity.svg?colorB=cd201f" height="30px"></a></td>
  </tr>
</table>

## Privacy Policy

The NightTube project aims to provide a private, anonymous experience for using web-based media services.  
NightTube does not collect any data without your consent.  

Read the full policy: [Privacy Policy](https://nighttube.net/legal/privacy/).

## License
[![GNU GPLv3 Image](https://www.gnu.org/graphics/gplv3-127x51.png)](https://www.gnu.org/licenses/gpl-3.0.en.html)  

NightTube is Free Software under the [GNU GPLv3](https://www.gnu.org/licenses/gpl.html).
