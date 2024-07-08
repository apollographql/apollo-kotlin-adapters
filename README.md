# Module apollo-adapters

apollo-kotlin-adapters contains adapters for common date and big decimal GraphQL scalars.

| Adapter                                                          | Artifact                | Description                                                                                      |
|------------------------------------------------------------------|-------------------------|--------------------------------------------------------------------------------------------------|
| `com.apollographql.adapter.core.BigDecimalAdapter`               | apollo-adapter-core     | For a Multiplatform `com.apollographql.adapter.core.BigDecimal` class holding big decimal values |
| `com.apollographql.adapter.core.JavaInstantAdapter`              | apollo-adapter-core     | For `java.time.Instant` ISO8601 dates                                                            |
| `com.apollographql.adapter.core.JavaLocalDateAdapter`            | apollo-adapter-core     | For `java.time.LocalDate` ISO8601 dates                                                          |
| `com.apollographql.adapter.core.JavaLocalDateTimeAdapter`        | apollo-adapter-core     | For `java.time.LocalDateTime` ISO8601 dates                                                      |
| `com.apollographql.adapter.core.JavaLocalTimeAdapter`            | apollo-adapter-core     | For `java.time.LocalTime` ISO8601 dates                                                          |
| `com.apollographql.adapter.core.JavaOffsetDateTimeAdapter`       | apollo-adapter-core     | For `java.time.OffsetDateTime` ISO8601 dates                                                     |
| `com.apollographql.adapter.core.DateAdapter`                     | apollo-adapter-core     | For `java.util.Date` ISO8601 dates                                                               |
| `com.apollographql.adapter.datetime.KotlinxInstantAdapter`       | apollo-adapter-datetime | For `kotlinx.datetime.Instant` ISO8601 dates                                                     |
| `com.apollographql.adapter.datetime.KotlinxLocalDateAdapter`     | apollo-adapter-datetime | For `kotlinx.datetime.LocalDate` ISO8601 dates                                                   |
| `com.apollographql.adapter.datetime.KotlinxLocalDateTimeAdapter` | apollo-adapter-datetime | For `kotlinx.datetime.LocalDateTime` ISO8601 dates                                               |
| `com.apollographql.adapter.datetime.KotlinxLocalTimeAdapter`     | apollo-adapter-datetime | For `kotlinx.datetime.LocalTime` ISO8601 dates                                                   |

Because some adapters use `kotlinx.datetime` (which itself uses `java.time`), `apollo-adapter-datetime` requires [core library desugaring](https://developer.android.com/studio/write/java8-support#library-desugaring) on Android API levels < 26
