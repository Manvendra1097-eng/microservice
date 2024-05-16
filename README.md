# Microservice




#### BaseEntity Class:
<p style="color:#999">It contains the common field which we want in all the Entity classes</p>

```Java
@MappedSuperclass
@Setter
@Getter
@ToString
public class BaseEntity {

    @Column(updatable = false)
    private LocalDateTime createdAt;

    @Column(updatable = false)
    private String createdBy;

    @Column(insertable = false)
    private LocalDateTime updatedAt;

    @Column(insertable = false)
    private String updatedBy;
}
```
