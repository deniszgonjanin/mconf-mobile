import com.flazr.*

def videoId = "201620741"

def url = "http://video.music.yahoo.com/ver/268.0/process/getPlaylistFOP.php?node_id=v" \
        + videoId + "&tech=flash&bitrate=5000&eventid=1301797";             

def xml = Utils.getOverHttp(url)