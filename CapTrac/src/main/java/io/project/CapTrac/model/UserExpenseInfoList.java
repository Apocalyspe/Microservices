package io.project.CapTrac.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class UserExpenseInfoList {

    private List<UserExpenseInfo> userExpenseInfoList;


}
