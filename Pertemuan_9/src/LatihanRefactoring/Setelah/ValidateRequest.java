package LatihanRefactoring.Setelah;

public class ValidateRequest {
    /*
    private void validateRequest(CustomerInquiryRequest request, int customerFieldLength, int productFieldLength) {
        checkCustomerInquiryNotNullOrEmpty(request);
        checkCustomerInquiryNullOrEmpty(request);
        checkCustomerIDValid(request, customerFieldLength);
        checkProductNumberValid(request, productFieldLength);
    }
    private void checkCustomerInquiryNotNullOrEmpty(CustomerInquiryRequest request) {
    if (!string.IsNullOrEmpty(request.Customer.CustomerID) &&
        !string.IsNullOrEmpty(request.CustomerProduct.ProductNumber)) {
        throw new BusinessException(HandledErrors.InvalidBothParameterMessage);
    }
}
    private void checkCustomerInquiryNullOrEmpty(CustomerInquiryRequest request) {
    if (string.IsNullOrEmpty(request.Customer.CustomerID) &&
        string.IsNullOrEmpty(request.CustomerProduct.ProductNumber)) {
        throw new BusinessException(HandledErrors.CustomerEmptyMessage);
    }
}
    private void checkCustomerIDValid(CustomerInquiryRequest request, int customerIDFieldLength) {
    if (!string.IsNullOrEmpty(request.Customer.CustomerID)) {
        if (request.Customer.CustomerID.Length > customerIDFieldLength) {
            throw new BusinessException(HandledErrors.CustomerInvalidLengthMessage);
        }
        request.Customer.CustomerID = request.Customer.CustomerID.PadLeft(
                customerIDFieldLength, Convert.ToChar("0", CultureInfo.CurrentCulture));
    }
}
    private void checkProductNumberValid(CustomerInquiryRequest request, int productFieldLength) {
    if (!string.IsNullOrEmpty(request.CustomerProduct.ProductNumber)) {
        if (request.CustomerProduct.ProductNumber.Length > productFieldLength) {
            throw new BusinessException(HandledErrors.ProductInvalidLengthMessage);
        }
        request.CustomerProduct.ProductNumber = request.CustomerProduct.ProductNumber.PadLeft(
                productFieldLength, Convert.ToChar("0", CultureInfo.CurrentCulture));
    }
}


     */
}
