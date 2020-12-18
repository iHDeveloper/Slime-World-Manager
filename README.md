# Slime World Manager (Fork. HD)

A fork that's focused on 1.8.8 `(1.8_R3)` release and maintained by @iHDeveloper.

## How to use
- Getting the API
```java
SlimePlugin plugin = (SlimePlugin) Bukkit.getPluginManager().getPlugin("SlimeWorldManager-HDFork");

/* If there's no HD fork plugin. Just get the original plugin */
if (plugin == null) {
    plugin = (SlimePlugin) Bukkit.getPluginManager().getPlugin("SlimeWorldManager");
}
```


- Load world with different name
```java
SlimeLoader loader = plugin.getLoader("file");
String originalName = "test_world";
String newName = "test_world2";
plugin.hd().loadWorld(loader, originalName, newName, true, new SlimePropertyMap());
```


- Save world with ability to force it or not
```java
// Without force (any read-only is going to be ignored)
plugin.hd().saveWorld(world, false);

// With force (it's going to save the read-only world)
// NOT RECOMMENDED
plugin.hd().saveWorld(world, true);
```


- For more information about the original API [Click here](https://github.com/Grinderwolf/Slime-World-Manager/tree/develop/.docs/api)

## Credits

Thanks to:
 * All the contributors who helped me by adding features to SWM.
 * [Glare](https://glaremasters.me) for providing me with a Maven repository.
 * [Minikloon](https://twitter.com/Minikloon) and all the [Hypixel](https://twitter.com/HypixelNetwork) team for developing the SRF.
 * [Grinderwolf](https://github.com/Grinderwolf) The original creator of the [Slime World Manager](https://github.com/Grinderwolf/Slime-World-Manager)
 
## YourKit

YourKit supports open source projects with innovative and intelligent tools for monitoring and profiling Java and .NET applications. YourKit is the creator of [YourKit Java Profiler](https://www.yourkit.com/java/profiler/), [YourKit .NET Profiler](https://www.yourkit.com/.net/profiler/) and [YourKit YouMonitor](https://www.yourkit.com/youmonitor/).

![YourKit](https://www.yourkit.com/images/yklogo.png)
