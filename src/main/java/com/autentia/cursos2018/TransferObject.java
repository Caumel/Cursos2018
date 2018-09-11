package com.autentia.cursos2018;

import java.io.Serializable;

public abstract class TransferObject implements Serializable {

    @Override
    public abstract int hashCode();

    @Override
    public abstract boolean equals(Object object);

}

