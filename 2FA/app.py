python -m venv app
virtualenv app
# importing needed libraries
from flask import Flask
from markupsafe import escape
from flask_bootstrap import Bootstrap

# configuring flask application
app = Flask(__name__)
app.config["SECRET_KEY"] = "APP_SECRET_KEY"
Bootstrap(app)


# homepage route
@app.route("/")
def index():
    return "<h1>Hello World!</h1>"


# running flask server
if __name__ == "__main__":
    app.run(debug=True)

