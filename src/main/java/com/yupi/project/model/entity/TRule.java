package com.yupi.project.model.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName t_rule
 */
@TableName(value ="t_rule")
@Data
public class TRule implements Serializable {
    /**
     * 可选值：开店规则、关店规则、客流规则。可扩展
     */
    private String ruletype;

    /**
     * 为空时，为系统通用规则。

不为空时，为门店规则。

当门店有门店规则时，使用门店规则进行排班，没有门店规则时，使用系统通用规则进行排班
     */
    private String store;

    /**
     * 需要开发者自行设计。

示例：

- 客流规则："3.8"  表示按照业务预测数据，每3.8个客流必须安排至少一个员工当值

- 开店规则："1.5,23.5" 表示开店1个半小时前需要有员工当值，当值员工数为门店面积除以23.5

- 关店规则："2.5,3,13" 表示关店2个半小时内需要有员工当值，当值员工数不小于3并且不小于门店面积除以13

为了提高规则的灵活性，建议使用json格式保存规则值，如关店规则：{"after":"2.5","count":"3","fomula":"size/13"}

需要开发者自行设计。

示例：

- 客流规则："3.8"  表示按照业务预测数据，每3.8个客流必须安排至少一个员工当值

- 开店规则："1.5,23.5" 表示开店1个半小时前需要有员工当值，当值员工数为门店面积除以23.5

- 关店规则："2.5,3,13" 表示关店2个半小时内需要有员工当值，当值员工数不小于3并且不小于门店面积除以13

为了提高规则的灵活性，建议使用json格式保存规则值，如关店规则：{"after":"2.5","count":"3","fomula":"size/13"}
     */
    private String rulevalue;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        TRule other = (TRule) that;
        return (this.getRuletype() == null ? other.getRuletype() == null : this.getRuletype().equals(other.getRuletype()))
            && (this.getStore() == null ? other.getStore() == null : this.getStore().equals(other.getStore()))
            && (this.getRulevalue() == null ? other.getRulevalue() == null : this.getRulevalue().equals(other.getRulevalue()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getRuletype() == null) ? 0 : getRuletype().hashCode());
        result = prime * result + ((getStore() == null) ? 0 : getStore().hashCode());
        result = prime * result + ((getRulevalue() == null) ? 0 : getRulevalue().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", ruletype=").append(ruletype);
        sb.append(", store=").append(store);
        sb.append(", rulevalue=").append(rulevalue);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}