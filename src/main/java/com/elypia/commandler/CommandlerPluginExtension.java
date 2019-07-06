package com.elypia.commandler;

import com.elypia.commandler.doc.Metadata;
import com.elypia.commandler.interfaces.MetaLoader;

import java.util.Collection;

public class CommandlerPluginExtension {

    private Metadata metadata;

    /** The loaders required to export this Commandler applications documentation. */
    private Collection<MetaLoader> loaders;

    /** If this plugin should export the default website with the docs. */
    private boolean defaultDocSite = true;

    public Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    public Collection<MetaLoader> getLoaders() {
        return loaders;
    }

    public void setLoaders(Collection<MetaLoader> loaders) {
        this.loaders = loaders;
    }
}
