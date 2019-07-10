def post = new URL("https://api.gomorpheus.com/api/blueprints").openConnection();
def message = '{"message":"this is a message"}'
post.setRequestMethod("POST")
post.setDoOutput(true)
post.setRequestProperty("Content-Type", "application/json")
post.setRequestProperty("Authorization", "")
def postRC = post.getResponseCode();
println(postRC);
if(postRC.equals(200)) {
    println(post.getInputStream().getText());
}
