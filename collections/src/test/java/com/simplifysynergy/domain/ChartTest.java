package com.simplifysynergy.domain;

import static org.assertj.core.api.Assertions.assertThat;

import com.simplifysynergy.web.rest.TestUtil;
import org.junit.jupiter.api.Test;

class ChartTest {

    @Test
    void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(Chart.class);
        Chart chart1 = new Chart();
        chart1.setId("id1");
        Chart chart2 = new Chart();
        chart2.setId(chart1.getId());
        assertThat(chart1).isEqualTo(chart2);
        chart2.setId("id2");
        assertThat(chart1).isNotEqualTo(chart2);
        chart1.setId(null);
        assertThat(chart1).isNotEqualTo(chart2);
    }
}
