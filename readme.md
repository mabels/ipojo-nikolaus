This is just a example what you get if you use
ipojo and osgi.

features:addurl http://repo1.maven.org/maven2/org/apache/felix/org.apache.felix.ipojo.features/1.11.0/org.apache.felix.ipojo.features-1.11.0.xml
features:install ipojo
features:install ipojo-command
features:install ipojo-all

osgi:install -s mvn:com.adviser.ipojo/nikolaus/0.0.1-SNAPSHOT

THX
@S2
