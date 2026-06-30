package icu.samnyan.aqua.api.model.resp.sega.ongeki.external;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ExternalUserData_getLastGameId_14134195947 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3182836;

    public ExternalUserData_getLastGameId_14134195947() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3182836 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term3182836, term3182836.getClass(), "accessCode", "mLanydxJNs");
        setField(term3182836, term3182836.getClass(), "userName", "NjEkutYHsf");
        setIntField(term3182836, term3182836.getClass(), "level", -994473581);
        setIntField(term3182836, term3182836.getClass(), "reincarnationNum", -1446108940);
        setLongField(term3182836, term3182836.getClass(), "exp", 6968043922289099625L);
        setLongField(term3182836, term3182836.getClass(), "point", -1348290221243322717L);
        setLongField(term3182836, term3182836.getClass(), "totalPoint", 1232144006345007258L);
        setIntField(term3182836, term3182836.getClass(), "playCount", -1516138087);
        setIntField(term3182836, term3182836.getClass(), "jewelCount", -1913590331);
        setIntField(term3182836, term3182836.getClass(), "totalJewelCount", -32643208);
        setIntField(term3182836, term3182836.getClass(), "medalCount", -154378857);
        setIntField(term3182836, term3182836.getClass(), "playerRating", -124720378);
        setIntField(term3182836, term3182836.getClass(), "highestRating", -286624164);
        setIntField(term3182836, term3182836.getClass(), "battlePoint", 252358858);
        setIntField(term3182836, term3182836.getClass(), "bestBattlePoint", -936714896);
        setIntField(term3182836, term3182836.getClass(), "overDamageBattlePoint", 697754874);
        setIntField(term3182836, term3182836.getClass(), "nameplateId", -1228593140);
        setIntField(term3182836, term3182836.getClass(), "trophyId", -277303676);
        setIntField(term3182836, term3182836.getClass(), "cardId", -1221822212);
        setIntField(term3182836, term3182836.getClass(), "characterId", 2140488467);
        setIntField(term3182836, term3182836.getClass(), "tabSetting", -767545774);
        setIntField(term3182836, term3182836.getClass(), "tabSortSetting", -1497445577);
        setIntField(term3182836, term3182836.getClass(), "cardCategorySetting", -1751624911);
        setIntField(term3182836, term3182836.getClass(), "cardSortSetting", 334589456);
        setIntField(term3182836, term3182836.getClass(), "rivalScoreCategorySetting", -2017592092);
        setIntField(term3182836, term3182836.getClass(), "playedTutorialBit", 1372450352);
        setIntField(term3182836, term3182836.getClass(), "firstTutorialCancelNum", 557350868);
        setLongField(term3182836, term3182836.getClass(), "sumTechHighScore", -7157318834429841163L);
        setLongField(term3182836, term3182836.getClass(), "sumTechBasicHighScore", -984111385919733294L);
        setLongField(term3182836, term3182836.getClass(), "sumTechAdvancedHighScore", -8441274610443015969L);
        setLongField(term3182836, term3182836.getClass(), "sumTechExpertHighScore", -8197630931388309514L);
        setLongField(term3182836, term3182836.getClass(), "sumTechMasterHighScore", 8539717964562776140L);
        setLongField(term3182836, term3182836.getClass(), "sumTechLunaticHighScore", 4535044889861514162L);
        setLongField(term3182836, term3182836.getClass(), "sumBattleHighScore", 4412981307274459523L);
        setLongField(term3182836, term3182836.getClass(), "sumBattleBasicHighScore", -4684570754715354832L);
        setLongField(term3182836, term3182836.getClass(), "sumBattleAdvancedHighScore", 6896542923681215111L);
        setLongField(term3182836, term3182836.getClass(), "sumBattleExpertHighScore", 7401627581779270694L);
        setLongField(term3182836, term3182836.getClass(), "sumBattleMasterHighScore", -2206042201829508416L);
        setLongField(term3182836, term3182836.getClass(), "sumBattleLunaticHighScore", 420687877692547094L);
        setField(term3182836, term3182836.getClass(), "eventWatchedDate", "DCghgYBiSR");
        setField(term3182836, term3182836.getClass(), "cmEventWatchedDate", "ZCxPVrJJuW");
        setField(term3182836, term3182836.getClass(), "firstGameId", "zgcgueoPPL");
        setField(term3182836, term3182836.getClass(), "firstRomVersion", "fsCormtsvQ");
        setField(term3182836, term3182836.getClass(), "firstDataVersion", "yCfVKckNJJ");
        setField(term3182836, term3182836.getClass(), "firstPlayDate", "mxJmZkmHrQ");
        setField(term3182836, term3182836.getClass(), "lastGameId", "jalcEdDctY");
        setField(term3182836, term3182836.getClass(), "lastRomVersion", "JHsTLCeutt");
        setField(term3182836, term3182836.getClass(), "lastDataVersion", "ysiLHpoTZO");
        setField(term3182836, term3182836.getClass(), "compatibleCmVersion", "edAwCYdGQu");
        setField(term3182836, term3182836.getClass(), "lastPlayDate", "CBfnNZyARE");
        setIntField(term3182836, term3182836.getClass(), "lastPlaceId", -194986605);
        setField(term3182836, term3182836.getClass(), "lastPlaceName", "nzFfOHZvad");
        setIntField(term3182836, term3182836.getClass(), "lastRegionId", 1580584998);
        setField(term3182836, term3182836.getClass(), "lastRegionName", "aQOyWoShuV");
        setIntField(term3182836, term3182836.getClass(), "lastAllNetId", 1951196377);
        setField(term3182836, term3182836.getClass(), "lastClientId", "fRCYRITvYD");
        setIntField(term3182836, term3182836.getClass(), "lastUsedDeckId", -747881721);
        setIntField(term3182836, term3182836.getClass(), "lastPlayMusicLevel", -91678168);
        setIntField(term3182836, term3182836.getClass(), "lastEmoneyBrand", 299385059);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastGameId", argTypes, term3182836, args);
    }

};


