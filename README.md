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
apollo-adapters-core = "com.apollographql.adapters:apollo-adapters-core:%latest_version%"
apollo-adapters-kotlinx-datetime = "com.apollographql.adapters:apollo-adapters-kotlinx-datetime:%latest_version%"
```

Apollo Kotlin Adapters contains adapters for common date and big decimal GraphQL scalars.

| Adapter                                                          | Artifact                         | Description                                                                                      |
|------------------------------------------------------------------|----------------------------------|--------------------------------------------------------------------------------------------------|
| `com.apollographql.adapter.core.BigDecimalAdapter`               | apollo-adapters-core             | For a Multiplatform `com.apollographql.adapter.core.BigDecimal` class holding big decimal values |
| `com.apollographql.adapter.core.JavaInstantAdapter`              | apollo-adapters-core             | For `java.time.Instant` ISO8601 dates                                                            |
| `com.apollographql.adapter.core.JavaLocalDateAdapter`            | apollo-adapters-core             | For `java.time.LocalDate` ISO8601 dates                                                          |
| `com.apollographql.adapter.core.JavaLocalDateTimeAdapter`        | apollo-adapters-core             | For `java.time.LocalDateTime` ISO8601 dates                                                      |
| `com.apollographql.adapter.core.JavaLocalTimeAdapter`            | apollo-adapters-core             | For `java.time.LocalTime` ISO8601 dates                                                          |
| `com.apollographql.adapter.core.JavaOffsetDateTimeAdapter`       | apollo-adapters-core             | For `java.time.OffsetDateTime` ISO8601 dates                                                     |
| `com.apollographql.adapter.core.DateAdapter`                     | apollo-adapters-core             | For `java.util.Date` ISO8601 dates                                                               |
| `com.apollographql.adapter.datetime.KotlinxInstantAdapter`       | apollo-adapters-kotlinx-datetime | For `kotlinx.datetime.Instant` ISO8601 dates                                                     |
| `com.apollographql.adapter.datetime.KotlinxLocalDateAdapter`     | apollo-adapters-kotlinx-datetime | For `kotlinx.datetime.LocalDate` ISO8601 dates                                                   |
| `com.apollographql.adapter.datetime.KotlinxLocalDateTimeAdapter` | apollo-adapters-kotlinx-datetime | For `kotlinx.datetime.LocalDateTime` ISO8601 dates                                               |
| `com.apollographql.adapter.datetime.KotlinxLocalTimeAdapter`     | apollo-adapters-kotlinx-datetime | For `kotlinx.datetime.LocalTime` ISO8601 dates                                                   |

Because some adapters use `kotlinx.datetime` (which itself uses `java.time`), `apollo-adapters-kotlinx-datetime` requires [core library desugaring](https://developer.android.com/studio/write/java8-support#library-desugaring) on Android API levels < 26

## 📚 Documentation

The Kdoc API reference can be found at:<br/>
[https://apollographql.github.io/apollo-kotlin-adapters/kdoc](https://apollographql.github.io/apollo-kotlin-adapters/kdoc)

