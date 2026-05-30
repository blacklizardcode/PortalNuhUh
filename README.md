# PortalNuhUh

PortalNuhUh is a small Fabric mod that lets you turn Nether and End portals on or off using gamerules. By default, both portals are disabled.

## What it does
- Stops Nether portals from forming when the Nether portal gamerule is off.
- Stops End portal frames from being activated when the End portal gamerule is off.

## Use in game
These gamerules control the portals. They are `false` by default.

Enable Nether portals:

```text
/gamerule portalnuhuh:enable_nether_portal true
```

Enable End portals:

```text
/gamerule portalnuhuh:enable_end_portal true
```

Disable them again by setting the value to `false`.

