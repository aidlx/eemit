# eemit
`eemit` is a small Java event emitter library. It lets you emit typed objects on named channels and handle them elsewhere in your code by subscribing to those channels.

### Install
Maven:
```xml
<dependency>
    <groupId>com.github.aidlx</groupId>
    <artifactId>eemit</artifactId>
    <version>0.1.0</version>
</dependency>
```

Gradle:
```groovy
implementation 'com.github.aidlx:eemit:0.1.0'
```

### Usage
```java
import com.github.aidlx.eemit.EventEmitter;

...

// Create an EventEmitter for any event type, here String
EventEmitter<String> emitter = new EventEmitter<>();

// Listen on channel "channel666". The callback receives the channel name and event object.
emitter.on("channel666", (channel, object) -> {
  // Do something with object
});

// Listen to events on all channels
emitter.on("*", (channel, object) -> {
  // Do something with object
});

// Emit an event on "channel666", second parameter is of type that you parameterized EventEmitter with
emitter.emit("channel666", "Some string");

// Emit to all channels
emitter.emit("*", "Some string");

// How to unlisten:
String uuid = emitter.on("channel666", (channel, object) -> {
  // Do something with object
});
// Unregister the callback later
emitter.off(uuid);
```

### Repository

Source and issues: https://github.com/aidlx/eemit
