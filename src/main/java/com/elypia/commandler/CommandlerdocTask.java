package com.elypia.commandler;

import com.elypia.commandler.doc.CommandlerDoc;
import com.elypia.commandler.metadata.ContextLoader;
import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;

import java.util.Objects;

public class CommandlerdocTask extends DefaultTask {

    public CommandlerdocTask() {
        setGroup("documentation");
        setDescription("Export this Commandler applications documentation JSON.");
    }

    @TaskAction
    public void commandlerdoc() {
        CommandlerPluginExtension extension = getProject()
            .getExtensions()
            .findByType(CommandlerPluginExtension.class);

        Objects.requireNonNull(extension);

        ContextLoader loader = new ContextLoader(extension.getLoaders());
        Context context = loader.load().build();
        CommandlerDoc commandlerDoc = new CommandlerDoc(context);
        String json = commandlerDoc.toJson();


    }
}
