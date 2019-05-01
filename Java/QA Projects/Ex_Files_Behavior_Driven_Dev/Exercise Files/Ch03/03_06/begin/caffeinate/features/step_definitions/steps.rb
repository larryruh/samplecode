Given("Maria orders ${int} of coffee from Li") do |int|
   maria = Customer.new
   li = Associate.new
   price = int
   maria.order
  end
  
  When("Maria pays with a credit card") do
    pending # Write code here that turns the phrase above into concrete actions
  end
  
  Then("Li should process the payment") do
    pending # Write code here that turns the phrase above into concrete actions
  end