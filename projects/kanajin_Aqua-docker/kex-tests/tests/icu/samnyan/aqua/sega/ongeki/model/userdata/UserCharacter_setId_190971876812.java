package icu.samnyan.aqua.sega.ongeki.model.userdata;

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
import static icu.samnyan.aqua.sega.ongeki.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class UserCharacter_setId_190971876812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term173169;
     Object term173454;

    public UserCharacter_setId_190971876812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term173175 = new Long(-7983954942068142191L);
        term173169 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCharacter"));
        Object term173171 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term173173 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term173189 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term173190 = newInstance(Class.forName("java.time.LocalDate"));
        Object term173194 = newInstance(Class.forName("java.time.LocalTime"));
        Object term173199 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term173200 = newInstance(Class.forName("java.time.LocalDate"));
        Object term173204 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term173169, term173169.getClass(), "id", 1528436527758807897L);
        setLongField(term173171, term173171.getClass(), "id", 8596776356769062426L);
        setLongField(term173173, term173173.getClass(), "id", 5489801275022449174L);
        setField(term173173, term173173.getClass(), "extId", term173175);
        setField(term173173, term173173.getClass(), "luid", "aUjUtfxzEa");
        setIntField(term173190, term173190.getClass(), "year", 2012);
        setShortField(term173190, term173190.getClass(), "month", (short) 8);
        setShortField(term173190, term173190.getClass(), "day", (short) 31);
        setField(term173189, term173189.getClass(), "date", term173190);
        setByteField(term173194, term173194.getClass(), "hour", (byte) 17);
        setByteField(term173194, term173194.getClass(), "minute", (byte) 11);
        setByteField(term173194, term173194.getClass(), "second", (byte) 29);
        setIntField(term173194, term173194.getClass(), "nano", 462334388);
        setField(term173189, term173189.getClass(), "time", term173194);
        setField(term173173, term173173.getClass(), "registerTime", term173189);
        setIntField(term173200, term173200.getClass(), "year", 2027);
        setShortField(term173200, term173200.getClass(), "month", (short) 11);
        setShortField(term173200, term173200.getClass(), "day", (short) 28);
        setField(term173199, term173199.getClass(), "date", term173200);
        setByteField(term173204, term173204.getClass(), "hour", (byte) 23);
        setByteField(term173204, term173204.getClass(), "minute", (byte) 7);
        setByteField(term173204, term173204.getClass(), "second", (byte) 56);
        setIntField(term173204, term173204.getClass(), "nano", 948648524);
        setField(term173199, term173199.getClass(), "time", term173204);
        setField(term173173, term173173.getClass(), "accessTime", term173199);
        setField(term173171, term173171.getClass(), "card", term173173);
        setField(term173171, term173171.getClass(), "userName", "UghbKcUNlZ");
        setIntField(term173171, term173171.getClass(), "level", -925647425);
        setIntField(term173171, term173171.getClass(), "reincarnationNum", 1341898586);
        setLongField(term173171, term173171.getClass(), "exp", 3670199197813857510L);
        setLongField(term173171, term173171.getClass(), "point", -6945994942019671231L);
        setLongField(term173171, term173171.getClass(), "totalPoint", 998429988856827865L);
        setIntField(term173171, term173171.getClass(), "playCount", -1763289432);
        setIntField(term173171, term173171.getClass(), "jewelCount", 882092074);
        setIntField(term173171, term173171.getClass(), "totalJewelCount", -705066137);
        setIntField(term173171, term173171.getClass(), "medalCount", -454954694);
        setIntField(term173171, term173171.getClass(), "playerRating", -473778335);
        setIntField(term173171, term173171.getClass(), "highestRating", -1516379970);
        setIntField(term173171, term173171.getClass(), "battlePoint", -2138200889);
        setIntField(term173171, term173171.getClass(), "bestBattlePoint", -510919719);
        setIntField(term173171, term173171.getClass(), "overDamageBattlePoint", 1116939662);
        setBooleanField(term173171, term173171.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term173171, term173171.getClass(), "nameplateId", 1460432517);
        setIntField(term173171, term173171.getClass(), "trophyId", -1565303291);
        setIntField(term173171, term173171.getClass(), "cardId", -2061583605);
        setIntField(term173171, term173171.getClass(), "characterId", -1469827981);
        setIntField(term173171, term173171.getClass(), "characterVoiceNo", -1389673403);
        setIntField(term173171, term173171.getClass(), "tabSetting", 584403812);
        setIntField(term173171, term173171.getClass(), "tabSortSetting", 1751116625);
        setIntField(term173171, term173171.getClass(), "cardCategorySetting", 1523894424);
        setIntField(term173171, term173171.getClass(), "cardSortSetting", 704725073);
        setIntField(term173171, term173171.getClass(), "rivalScoreCategorySetting", 556138661);
        setIntField(term173171, term173171.getClass(), "playedTutorialBit", -1314160786);
        setIntField(term173171, term173171.getClass(), "firstTutorialCancelNum", -1226932272);
        setLongField(term173171, term173171.getClass(), "sumTechHighScore", -8091705543121844925L);
        setLongField(term173171, term173171.getClass(), "sumTechBasicHighScore", 1302712590640978911L);
        setLongField(term173171, term173171.getClass(), "sumTechAdvancedHighScore", -7957881599739235622L);
        setLongField(term173171, term173171.getClass(), "sumTechExpertHighScore", -396071947160054847L);
        setLongField(term173171, term173171.getClass(), "sumTechMasterHighScore", 2937562706259874365L);
        setLongField(term173171, term173171.getClass(), "sumTechLunaticHighScore", 206671275196386798L);
        setLongField(term173171, term173171.getClass(), "sumBattleHighScore", -7596468049174943101L);
        setLongField(term173171, term173171.getClass(), "sumBattleBasicHighScore", -8934829546091064707L);
        setLongField(term173171, term173171.getClass(), "sumBattleAdvancedHighScore", -1817118062205258940L);
        setLongField(term173171, term173171.getClass(), "sumBattleExpertHighScore", 5152881384985879922L);
        setLongField(term173171, term173171.getClass(), "sumBattleMasterHighScore", 6842453043778777728L);
        setLongField(term173171, term173171.getClass(), "sumBattleLunaticHighScore", -910417449802075841L);
        setField(term173171, term173171.getClass(), "eventWatchedDate", "fMURyzrrea");
        setField(term173171, term173171.getClass(), "cmEventWatchedDate", "ygrjPzcZKQ");
        setField(term173171, term173171.getClass(), "firstGameId", "grvnzDWRmO");
        setField(term173171, term173171.getClass(), "firstRomVersion", "eYEANXeClm");
        setField(term173171, term173171.getClass(), "firstDataVersion", "JwZLjiquUU");
        setField(term173171, term173171.getClass(), "firstPlayDate", "JAwwxWQgmr");
        setField(term173171, term173171.getClass(), "lastGameId", "lAdAYXKfnL");
        setField(term173171, term173171.getClass(), "lastRomVersion", "lTNqOlLdpl");
        setField(term173171, term173171.getClass(), "lastDataVersion", "SPhkdbcCTv");
        setField(term173171, term173171.getClass(), "compatibleCmVersion", "MdyRBldsUU");
        setField(term173171, term173171.getClass(), "lastPlayDate", "bMomxgTVVZ");
        setIntField(term173171, term173171.getClass(), "lastPlaceId", 2043153984);
        setField(term173171, term173171.getClass(), "lastPlaceName", "QqyLAXdHvC");
        setIntField(term173171, term173171.getClass(), "lastRegionId", 627237547);
        setField(term173171, term173171.getClass(), "lastRegionName", "VwJUzMDEZT");
        setIntField(term173171, term173171.getClass(), "lastAllNetId", 342899515);
        setField(term173171, term173171.getClass(), "lastClientId", "xvJUVvysto");
        setIntField(term173171, term173171.getClass(), "lastUsedDeckId", 2137920886);
        setIntField(term173171, term173171.getClass(), "lastPlayMusicLevel", 982773727);
        setIntField(term173171, term173171.getClass(), "lastEmoneyBrand", -1195380899);
        setField(term173169, term173169.getClass(), "user", term173171);
        setIntField(term173169, term173169.getClass(), "characterId", 777693111);
        setIntField(term173169, term173169.getClass(), "costumeId", 2053588730);
        setIntField(term173169, term173169.getClass(), "attachmentId", 2012914024);
        setIntField(term173169, term173169.getClass(), "playCount", 1961729999);
        setIntField(term173169, term173169.getClass(), "intimateLevel", -416107422);
        setIntField(term173169, term173169.getClass(), "intimateCount", -228328293);
        setIntField(term173169, term173169.getClass(), "intimateCountRewarded", 885509363);
        setField(term173169, term173169.getClass(), "intimateCountDate", "PEpzfnEzeY");
        setBooleanField(term173169, term173169.getClass(), "isNew", true);
        term173454 = new Long(-7385931487102085953L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCharacter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term173454;
        callMethod(klass, "setId", argTypes, term173169, args);
    }

};


