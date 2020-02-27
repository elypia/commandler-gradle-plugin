# Commandler Gradle Plugin [![Matrix]][matrix-community] [![Discord]][discord-guild] [![Build]][gitlab] [![Coverage]][gitlab] [![Donate]][elypia-donate]

## About
This is the Gradle plugin which wraps around [Commandler] and allows some post
compile steps to be done through Gradle such as exporting your documentation.

Currently the only use for the Commandler Gradle Plugin is to export your 
command handler documentation as JSON in order to give to an external website
or service to display to users though the `commandlerdoc` task.

## Usage
This will run a small application which loads and configured a Commandler
instance, however does not instantiate or run any of it's integrations
to ensure you're application doesn't actually go live. This allows
Commandler to load all metadata and keep a hold of it in a state it
can be exported easily into other formats such as JSON for passing
to a website to display.

## Open-Source
This project is licenced under the Apache 2.0 project, don't be afraid to derive or reference
from this project all you want!

**All non-code files including videos, models, audio, bitmaps, vectors, and 
animations such as gifs, are not under the aforementioned license; all rights
are reserved by Elypia CIC.** 

## Support
Should any problems occur, come visit us over on Discord! We're always around and
there are ample developers that would be willing to help; if it's a problem with the library
itself then we'll make sure to get it sorted.

[matrix-community]: https://matrix.to/#/+elypia:matrix.org "Matrix Invite"
[discord-guild]: https://discordapp.com/invite/hprGMaM "Discord Invite"
[gitlab]: https://gitlab.com/Elypia/commandler-gradle-plugin/commits/master "Repository on GitLab"
[elypia-donate]: https://elypia.org/donate "Donate to Elypia"
[Commandler]: https://gitlab.com/Elypia/commandler "Commandler on GitLab"
[elypia]: https://elypia.org/ "Elypia Homepage"

[Matrix]: https://img.shields.io/matrix/elypia-general:matrix.org?logo=matrix "Matrix Shield"
[Discord]: https://discordapp.com/api/guilds/184657525990359041/widget.png "Discord Shield"
[Build]: https://gitlab.com/Elypia/commandler-gradle-plugin/badges/master/pipeline.svg "GitLab Build Shield"
[Coverage]: https://gitlab.com/Elypia/commandler-gradle-plugin/badges/master/coverage.svg "GitLab Coverage Shield"
[Donate]: https://img.shields.io/badge/Elypia-Donate-blueviolet "Donate Shield"
