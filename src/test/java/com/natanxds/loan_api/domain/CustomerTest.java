package com.natanxds.loan_api.domain;

import com.natanxds.loan_api.TestHelper;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class CustomerTest {

    @Nested
    class isIncomeEqualOrLowerThan {

        @Test
        void shouldBeTrueWhenIncomeIsEqual() {
            // Arrange
            var customer = TestHelper.createCustomer();

            // Act
            // Assert
            assertTrue(customer.isIncomeEqualOrLowerThan(3000.0));
        }

        @Test
        void shouldBeTrueWhenIncomeIsLower() {
            // Arrange
            var customer = TestHelper.createCustomer();

            // Act
            // Assert
            assertTrue(customer.isIncomeEqualOrLowerThan(9000.0));
        }

        @Test
        void shouldBeFalseWhenIncomeIsGreater() {
            // Arrange
            var customer = TestHelper.createCustomer();

            // Act
            // Assert
            assertFalse(customer.isIncomeEqualOrLowerThan(1000.0));
        }
    }

    @Nested
    class isIncomeEqualOrHigherThan {

        @Test
        void shouldBeTrueWhenIncomeIsEqual() {
            // Arrange
            var customer = TestHelper.createCustomer();

            // Act
            // Assert
            assertTrue(customer.isIncomeEqualOrHigherThan(3000.0));
        }

        @Test
        void shouldBeTrueWhenIncomeIsLower() {
            // Arrange
            var customer = TestHelper.createCustomer();

            // Act
            // Assert
            assertFalse(customer.isIncomeEqualOrHigherThan(9000.0));
        }

        @Test
        void shouldBeFalseWhenIncomeIsGreater() {
            // Arrange
            var customer = TestHelper.createCustomer();

            // Act
            // Assert
            assertTrue(customer.isIncomeEqualOrHigherThan(1000.0));
        }
    }

    @Nested
    class isIncomeBetween {

        @Test
        void shouldBeTrueWhenIncomeIsBetween() {
            // Arrange
            var customer = TestHelper.createCustomer();

            // Act
            // Assert
            assertTrue(customer.isIncomeBetween(3000.0, 5000.0));
        }

        @Test
        void shouldBeFalseWhenIncomeIsNotBetween() {
            // Arrange
            var customer = TestHelper.createCustomer();

            // Act
            // Assert
            assertFalse(customer.isIncomeBetween(9000.0, 10000.0));
        }
    }

    @Nested
    class isFromLocation {

        @Test
        void shouldBeTrueWhenIsFromLocation() {
            // Arrange
            var customer = TestHelper.createCustomer();

            // Act
            // Assert
            assertTrue(customer.isFromLocation("SP"));
        }

        @Test
        void shouldBeFalseWhenIsNotFromLocation() {
            // Arrange
            var customer = TestHelper.createCustomer();

            // Act
            // Assert
            assertFalse(customer.isFromLocation("MG"));
        }
    }

}