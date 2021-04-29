package codetime.data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TopVideosRepository implements TopVideosInterface {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public TopVideosRepository(JdbcTemplate aTemplate){
        jdbcTemplate = aTemplate;
    }

    @Override
    public List<TopVideos> findAll() {
        return jdbcTemplate.query(
                "select videoId, videoName, videoLevel, videoDuration," +
                     " videoCategory, videoDescription, videoCreator, videoUrl " +
                     "from top_videos",
            new Object[]{},
                (rs, i) -> new TopVideos(
                    rs.getInt("videoId"),
                    rs.getString("videoName"),
                    rs.getString("videoLevel"),
                    rs.getString("videoDuration"),
                    rs.getString("videoCategory"),
                    rs.getString("videoDescription"),
                    rs.getString("videoCreator"),
                    rs.getString("videoUrl")
                )
        );
    }
}
