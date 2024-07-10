# Welcome

Add to your project:

```toml
[libraries]
apollo-adapters-core = "com.apollographql.adapters:apollo-adapters:%latest_version%"
apollo-adapters-kotlinx-datetime = "com.apollographql.adapters:apollo-adapters-kotlinx-datetime:%latest_version%"
```

apollo-kotlin-adapters contains adapters for common date and big decimal GraphQL scalars.

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
