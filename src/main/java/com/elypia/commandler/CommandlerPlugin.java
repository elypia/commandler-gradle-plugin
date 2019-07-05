package com.elypia.commandler;

import org.gradle.api.*;

public class CommandlerPlugin implements Plugin<Project> {

    @Override
    public void apply(Project target) {
        target.getExtensions().create("commandler", CommandlerPluginExtension.class);
        target.getTasks().create("commandlerdoc", CommandlerdocTask.class);
    }
}
