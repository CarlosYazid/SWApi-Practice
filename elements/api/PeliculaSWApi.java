package elements.api;
import elements.general.Personaje;
import elements.general.Planeta;

import java.util.ArrayList;

public record PeliculaSWApi(String title,
                            int episode_id,
                            String opening_crawl,
                            String director,
                            String producer,
                            String release_date) {
}
