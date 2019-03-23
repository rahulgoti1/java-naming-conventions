# java-naming-conventions
This is about how to choose name and handle error in java.

- Handling null pointer exception
- Naming conventions
- Comments rule / google checkstyles
- Always throw exception from bottom to top level call hierarchy



-------------------------------
Handling null pointer exception
-------------------------------
NullPointerException is a situation in code where you try to access/ modify an object which has not been initialized yet. It essentially means that object reference variable is not pointing anywhere and refers to nothing or ‘null‘.

- Invoking methods on an object which is not initialized
- Parameters passed in a method are null
- Calling toString() method on object which is null
- Comparing object properties in if block without checking null equality
- Chained statements i.e. multiple method calls in a single statement

- Apache commons lang
  > StringUtils.isEmpty

- Aiming for fail fast behavior is a good choice in most situations.

- Use String.valueOf() Rather than toString()

- Avoid returning null from your methods
	```public List getDataDemo()
	{
		if(data == null)
			return Collections.EMPTY_LIST; //Returns unmodifiable list
		return data;
	}
	```

- CONST.equals(var)

- preconditions-guava-java// Preconditions.checkArgument(value >= 0.0, "negative value: %s", value);

- Use of Optional class



------------------
Naming conventions
------------------

Classes and Interfaces :
	`First letter capital Camel case`

Methods :
	`First letter lowercase camel case`

Variables :
	`Should not start with underscore(‘_’) or dollar sign ‘$’ characters.
	One-character variable names should be avoided`

Constant variables :
	`Should be all uppercase with words separated by underscores (“_”).
	public static final float POSITIVE_INFINITY = 1.0f / 0.0f;`

Packages :
	`all-lowercase : com.ninjaapp.api.controller`

Enumeration :
	`names should be all uppercase letters.`


----------------------------------
Comments rule / google checkstyles
----------------------------------

``` 
https://github.com/checkstyle/checkstyle/blob/master/src/main/resources/google_checks.xml

```


---------------------------
Collections API/ Stream API
---------------------------

A collection is an in-memory data structure to hold values and before we start using collection, all the values should have been populated. Whereas a java Stream is a data structure that is computed on-demand.

Java Stream doesn’t store data, it operates on the source data structure (collection and array) and produce pipelined data that we can use and perform specific operations. Such as we can create a stream from the list and filter it based on a condition.

Java Stream operations use functional interfaces, that makes it a very good fit for functional programming using lambda expression. As you can see in the above example that using lambda expressions make our code readable and short.

Java Streams are consumable, so there is no way to create a reference to stream for future usage. Since the data is on-demand, it’s not possible to reuse the same stream multiple times.

java.util.stream
Java Stream Intermediate and Terminal Operations
	- filter
	- map

forEach, toArray, min, max, findFirst, anyMatch, allMatch
