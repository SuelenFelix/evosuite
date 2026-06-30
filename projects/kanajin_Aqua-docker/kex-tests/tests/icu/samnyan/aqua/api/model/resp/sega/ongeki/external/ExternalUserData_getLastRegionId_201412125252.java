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

public class ExternalUserData_getLastRegionId_201412125252 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term116742;

    public ExternalUserData_getLastRegionId_201412125252() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term116742 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term116742, term116742.getClass(), "accessCode", "xGFzxRHdJV");
        setField(term116742, term116742.getClass(), "userName", "WrWVfVhVRp");
        setIntField(term116742, term116742.getClass(), "level", 1404321470);
        setIntField(term116742, term116742.getClass(), "reincarnationNum", -553973370);
        setLongField(term116742, term116742.getClass(), "exp", 1061508141965683676L);
        setLongField(term116742, term116742.getClass(), "point", 3123909296078390926L);
        setLongField(term116742, term116742.getClass(), "totalPoint", -678762659943476658L);
        setIntField(term116742, term116742.getClass(), "playCount", -1041564065);
        setIntField(term116742, term116742.getClass(), "jewelCount", -1502696946);
        setIntField(term116742, term116742.getClass(), "totalJewelCount", -2135610862);
        setIntField(term116742, term116742.getClass(), "medalCount", 2028453357);
        setIntField(term116742, term116742.getClass(), "playerRating", -78194090);
        setIntField(term116742, term116742.getClass(), "highestRating", 1022345169);
        setIntField(term116742, term116742.getClass(), "battlePoint", -61411299);
        setIntField(term116742, term116742.getClass(), "bestBattlePoint", 690094758);
        setIntField(term116742, term116742.getClass(), "overDamageBattlePoint", 1986960975);
        setIntField(term116742, term116742.getClass(), "nameplateId", 370763433);
        setIntField(term116742, term116742.getClass(), "trophyId", -1769747612);
        setIntField(term116742, term116742.getClass(), "cardId", -1926330584);
        setIntField(term116742, term116742.getClass(), "characterId", -723054791);
        setIntField(term116742, term116742.getClass(), "tabSetting", -1353853460);
        setIntField(term116742, term116742.getClass(), "tabSortSetting", -1446555241);
        setIntField(term116742, term116742.getClass(), "cardCategorySetting", 1908864146);
        setIntField(term116742, term116742.getClass(), "cardSortSetting", 1581967364);
        setIntField(term116742, term116742.getClass(), "rivalScoreCategorySetting", 1520568682);
        setIntField(term116742, term116742.getClass(), "playedTutorialBit", -958196271);
        setIntField(term116742, term116742.getClass(), "firstTutorialCancelNum", -107209578);
        setLongField(term116742, term116742.getClass(), "sumTechHighScore", -9090305422882341395L);
        setLongField(term116742, term116742.getClass(), "sumTechBasicHighScore", 7752737690232559172L);
        setLongField(term116742, term116742.getClass(), "sumTechAdvancedHighScore", 20348250406112312L);
        setLongField(term116742, term116742.getClass(), "sumTechExpertHighScore", -7849976618037063561L);
        setLongField(term116742, term116742.getClass(), "sumTechMasterHighScore", -8606336377218837996L);
        setLongField(term116742, term116742.getClass(), "sumTechLunaticHighScore", 1854385752458024304L);
        setLongField(term116742, term116742.getClass(), "sumBattleHighScore", 5116034910258191120L);
        setLongField(term116742, term116742.getClass(), "sumBattleBasicHighScore", 2128565041828444750L);
        setLongField(term116742, term116742.getClass(), "sumBattleAdvancedHighScore", -2512394700498847222L);
        setLongField(term116742, term116742.getClass(), "sumBattleExpertHighScore", 6405637973209457093L);
        setLongField(term116742, term116742.getClass(), "sumBattleMasterHighScore", -1846822394580187184L);
        setLongField(term116742, term116742.getClass(), "sumBattleLunaticHighScore", 7470149372052804970L);
        setField(term116742, term116742.getClass(), "eventWatchedDate", "hzlOcutDCG");
        setField(term116742, term116742.getClass(), "cmEventWatchedDate", "ZwCSqLBiYc");
        setField(term116742, term116742.getClass(), "firstGameId", "JRQlLonBxC");
        setField(term116742, term116742.getClass(), "firstRomVersion", "DtcbgxVotW");
        setField(term116742, term116742.getClass(), "firstDataVersion", "XgtkWJhDrr");
        setField(term116742, term116742.getClass(), "firstPlayDate", "aoJqAZOUJz");
        setField(term116742, term116742.getClass(), "lastGameId", "WsATyGNPZU");
        setField(term116742, term116742.getClass(), "lastRomVersion", "DANmFlRIuU");
        setField(term116742, term116742.getClass(), "lastDataVersion", "iYncdDHnkA");
        setField(term116742, term116742.getClass(), "compatibleCmVersion", "riFklUwKMI");
        setField(term116742, term116742.getClass(), "lastPlayDate", "LHduRqftkV");
        setIntField(term116742, term116742.getClass(), "lastPlaceId", -674754682);
        setField(term116742, term116742.getClass(), "lastPlaceName", "EyYgFqhUFa");
        setIntField(term116742, term116742.getClass(), "lastRegionId", -438793351);
        setField(term116742, term116742.getClass(), "lastRegionName", "RNrYlNFXaw");
        setIntField(term116742, term116742.getClass(), "lastAllNetId", -1047221475);
        setField(term116742, term116742.getClass(), "lastClientId", "dsHQnDBJhZ");
        setIntField(term116742, term116742.getClass(), "lastUsedDeckId", -1114135627);
        setIntField(term116742, term116742.getClass(), "lastPlayMusicLevel", 1056950434);
        setIntField(term116742, term116742.getClass(), "lastEmoneyBrand", -914994098);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastRegionId", argTypes, term116742, args);
    }

};


