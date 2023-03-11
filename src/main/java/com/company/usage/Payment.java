package com.company.usage;

import lombok.Data;
import com.company.jdbc.JDBCColumn;
import com.company.jdbc.JDBCColumnInstance;
import com.company.jdbc.JDBCEntity;
import com.company.jdbc.JDBCTableMapping;

@Data
@JDBCEntity
public class Payment {
    @JDBCColumn(name = "id")
    private Long id;

    @JDBCColumn(name = "payment_date")
    private String date;

    @JDBCColumn(name = "payment_amount")
    private Double amount;

    @JDBCColumnInstance(table = {
            @JDBCTableMapping(varName = "id", columnName = "user_id"),
            @JDBCTableMapping(varName = "name", columnName = "user_name"),
            @JDBCTableMapping(varName = "surname", columnName = "user_surname"),
            @JDBCTableMapping(varName = "company.id", columnName = "company_id"),
            @JDBCTableMapping(varName = "company.name", columnName = "company_name")
    })
    private User user;

}
