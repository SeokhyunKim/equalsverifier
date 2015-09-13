/*
 * Copyright 2013 Jan Ouwens
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package nl.jqno.equalsverifier.coverage;

import nl.jqno.equalsverifier.testhelpers.types.Color;

/**
 * equals and hashCode generated by Project Lombok 0.12, using delombok.
 */
/*
 * Original class:
 *
 * @EqualsAndHashCode
 * public final class LombokInstanceOfPoint {
 *    private final int x;
 *    private final int y;
 *    private final Color color;
 *
 *    public LombokInstanceOfPoint(int x, int y, Color color) {
 *        this.x = x;
 *        this.y = y;
 *        this.color = color;
 *    }
 * }
 */
// CHECKSTYLE: ignore LocalFinalVariableName for 35 lines.
public final class LombokInstanceOfPoint {
    private final int x;
    private final int y;
    private final Color color;

    public LombokInstanceOfPoint(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    public boolean equals(final java.lang.Object o) {
        if (o == this) return true;
        if (!(o instanceof LombokInstanceOfPoint)) return false;
        final LombokInstanceOfPoint other = (LombokInstanceOfPoint)o;
        if (this.x != other.x) return false;
        if (this.y != other.y) return false;
        final java.lang.Object this$color = this.color;
        final java.lang.Object other$color = other.color;
        if (this$color == null ? other$color != null : !this$color.equals(other$color)) return false;
        return true;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    public int hashCode() {
        final int PRIME = 31;
        int result = 1;
        result = result * PRIME + this.x;
        result = result * PRIME + this.y;
        final java.lang.Object $color = this.color;
        result = result * PRIME + ($color == null ? 0 : $color.hashCode());
        return result;
    }
}
