package com.huangbiao.test;

public abstract class AbstractObjBuilder<T>
implements IObjBuilder<T>
{
protected T t;

public final void setObj(T paramT)
{
  this.t = paramT;
}

public final T getObj()
{
  return this.t;
}

public void setAttribute(String paramString1, String paramString2) {}

public void setText(String paramString) {}

public <E> void addChild(String paramString, E paramE) {}

public T newObject()
{
  return null;
}
}
