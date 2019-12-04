/*
 * Copyright 2019-2019 Elypia CIC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.elypia.commandler;

import org.elypia.commandler.doc.CommandlerDoc;
import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;

import java.util.Objects;

/**
 * @author seth@elypia.org (Seth Falco)
 */
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

        Commandler commandler = new Commandler();
        CommandlerDoc commandlerDoc = new CommandlerDoc(commandler.getAppContext());
        String json = commandlerDoc.toJson();
    }
}
