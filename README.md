# Commandler Gradle Plugin [![Discord][discord-members]][discord] [![GitLab Pipeline Status][gitlab-build]][gitlab] [![Coverage][gitlab-coverage]][gitlab] 

## About
This is the Gradle plugin which wraps around [Commandler][commandler] and allows some post compile steps to be done
through Gradle such as exporting your documentation.

Currently the only use for the Commandler Gradle Plugin is to export your command handler documentation as JSON
in order to give to an external website or service to display to users though the `commandlerdoc` task.

## Usage
```groovy
import com.elypia.commandler.loader.AnnotationLoader
import com.elypia.commandler.modules.HelpModule

commandler {
    def types = [HelpModule.class]

    loaders = [
        new AnnotationLoader(types)
    ]
}
```
> You must configure the `commandler` plugin to use the `MetaLoader`s required 
> to find all data to generate your documentation JSON.

## Support
Should any problems occur, come visit us over on [Discord][discord]! We're always around and there are
ample developers that would be willing to help; if it's a problem with the library itself then we'll
make sure to get it sorted.

[discord]: https://discord.gg/hprGMaM "Discord Invite"
[discord-members]: https://discordapp.com/api/guilds/184657525990359041/widget.png "Discord Shield"
[gitlab]: https://gitlab.com/Elypia/commandler-gradle-plugin/commits/master "Repository on GitLab"
[gitlab-build]: https://gitlab.com/Elypia/commandler-gradle-plugin/badges/master/pipeline.svg "GitLab Build Shield"
[gitlab-coverage]: https://gitlab.com/Elypia/commandler-gradle-plugin/badges/master/coverage.svg "GitLab Coverage Shield"
[commandler]: https://gitlab.com/Elypia/commandler "Commandler on GitLab"
[elypia]: https://elypia.com/ "Elypia Homepage"
