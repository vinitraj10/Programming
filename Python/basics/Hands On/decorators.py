def log_message(func):
   def func_wrapper(name):
   		f = open("tmp/temp.txt","w")
   		f.write(name)
   		f.close()
      
   return func_wrapper

@log_message
def get_text(name):
   return "lorem ipsum, {0} dolor sit amet".format(name)

get_text("John")

# Outputs <p>lorem ipsum, John dolor sit amet</p>