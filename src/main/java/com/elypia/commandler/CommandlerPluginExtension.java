package com.elypia.commandler;

import com.elypia.commandler.interfaces.MetaLoader;

import java.util.Collection;

public class CommandlerPluginExtension {

    private Collection<MetaLoader> loaders;

    public Collection<MetaLoader> getLoaders() {
        return loaders;
    }

    public void setLoaders(Collection<MetaLoader> loaders) {
        this.loaders = loaders;
    }
}
