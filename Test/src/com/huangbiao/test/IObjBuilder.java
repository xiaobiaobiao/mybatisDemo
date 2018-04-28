package com.huangbiao.test;

	public abstract interface IObjBuilder<T>
	{
	  public abstract T getObj();
	  
	  public abstract void setAttribute(String paramString1, String paramString2);
	  
	  public abstract void setText(String paramString);
	  
	  public abstract <E> void addChild(String paramString, E paramE);
	  
	  public abstract T newObject();
	  
	  public abstract void setObj(T paramT);

}
