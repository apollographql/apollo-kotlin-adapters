<div align="center">

<p>
	<a href="https://www.apollographql.com/"><img src="https://raw.githubusercontent.com/apollographql/apollo-client-devtools/a7147d7db5e29b28224821bf238ba8e3a2fdf904/assets/apollo-wordmark.svg" height="100" alt="Apollo Client"></a>
</p>

[![Discourse](https://img.shields.io/discourse/topics?label=Discourse&server=https%3A%2F%2Fcommunity.apollographql.com&logo=discourse&color=467B95&style=flat-square)](http://community.apollographql.com/new-topic?category=Help&tags=mobile,client)
[![Slack](https://img.shields.io/static/v1?label=kotlinlang&message=apollo-kotlin&color=A97BFF&logo=slack&style=flat-square)](https://app.slack.com/client/T09229ZC6/C01A6KM1SBZ)
[![Discord](https://img.shields.io/discord/1022972389463687228.svg?color=7389D8&labelColor=6A7EC2&logo=discord&logoColor=ffffff&style=flat-square)](https://discord.com/invite/graphos)

[![Maven Central](https://img.shields.io/maven-central/v/com.apollographql.adapters/apollo-adapters-core?style=flat-square)](https://central.sonatype.com/namespace/com.apollographql.adapters)
[![OSS Snapshots](https://img.shields.io/nexus/s/com.apollographql.adapters/apollo-adapters-core?server=https%3A%2F%2Fs01.oss.sonatype.org&label=oss-snapshots&style=flat-square)](https://s01.oss.sonatype.org/content/repositories/snapshots/com/apollographql/adapters/)

</div>

## 🚀 Apollo Adapters

Add to your project:

```toml
[libraries]
apollo-adapters-core = "com.apollographql.adapters:apollo-adapters-core:0.0.4"
apollo-adapters-kotlinx-datetime = "com.apollographql.adapters:apollo-adapters-kotlinx-datetime:0.0.4"
```

Apollo Kotlin Adapters contains adapters for common date and big decimal classes.

> [!WARNING]
> GraphQL scalar names and [coercing](https://www.graphql.de/blog/scalars-in-depth/) may vary depending on your server implementation. The adapters are provided for convenience but may not map exactly what your server expects or returns. In those cases, feel free to copy/paste and adapt the implementation. 

| Adapter                       | Artifact                         | Kotlin type                                 |
|-------------------------------|----------------------------------|---------------------------------------------|
| `BigDecimalAdapter`           | apollo-adapters-core             | `com.apollographql.adapter.core.BigDecimal` |
| `JavaInstantAdapter`          | apollo-adapters-core             | `java.time.Instant`                         |
| `JavaLocalDateAdapter`        | apollo-adapters-core             | `java.time.LocalDate`                       |
| `JavaLocalDateTimeAdapter`    | apollo-adapters-core             | `java.time.LocalDateTime`                   |
| `JavaLocalTimeAdapter`        | apollo-adapters-core             | `java.time.LocalTime`                       |
| `JavaOffsetDateTimeAdapter`   | apollo-adapters-core             | `java.time.OffsetDateTime`                  |
| `JavaZonedDateTimeAdapter`    | apollo-adapters-core             | `java.time.ZonedDateTime`                   |
| `DateAdapter`                 | apollo-adapters-core             | `java.util.Date`                            |
| `UnitAdapter`                 | apollo-adapters-core             | `kotlin.Unit`                               |
| `KotlinxInstantAdapter`       | apollo-adapters-kotlinx-datetime | `kotlinx.datetime.Instant`                  |
| `KotlinxLocalDateAdapter`     | apollo-adapters-kotlinx-datetime | `kotlinx.datetime.LocalDate`                |
| `KotlinxLocalDateTimeAdapter` | apollo-adapters-kotlinx-datetime | `kotlinx.datetime.LocalDateTime`            |
| `KotlinxLocalTimeAdapter`     | apollo-adapters-kotlinx-datetime | `kotlinx.datetime.LocalTime`                |

Because some adapters use `kotlinx.datetime` (which itself uses `java.time`), `apollo-adapters-kotlinx-datetime` requires [core library desugaring](https://developer.android.com/studio/write/java8-support#library-desugaring) on Android API levels < 26

## 📚 Documentation

The Kdoc API reference can be found at:<br/>
[https://apollographql.github.io/apollo-kotlin-adapters/kdoc](https://apollographql.github.io/apollo-kotlin-adapters/kdoc)

