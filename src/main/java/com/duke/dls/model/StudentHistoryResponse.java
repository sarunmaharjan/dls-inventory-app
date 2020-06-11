package com.duke.dls.model;

import com.duke.dls.model.entity.StudentHistory;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class StudentHistoryResponse {

    List<StudentHistory> studentHistoryList;
}
