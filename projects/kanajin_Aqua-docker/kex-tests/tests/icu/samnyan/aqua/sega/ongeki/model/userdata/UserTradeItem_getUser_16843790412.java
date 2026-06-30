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

public class UserTradeItem_getUser_16843790412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term151120;

    public UserTradeItem_getUser_16843790412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term151126 = new Long(-187772971269812453L);
        term151120 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTradeItem"));
        Object term151122 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term151124 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term151140 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term151141 = newInstance(Class.forName("java.time.LocalDate"));
        Object term151145 = newInstance(Class.forName("java.time.LocalTime"));
        Object term151150 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term151151 = newInstance(Class.forName("java.time.LocalDate"));
        Object term151155 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term151120, term151120.getClass(), "id", -9062864130224560298L);
        setLongField(term151122, term151122.getClass(), "id", -1322070514457737058L);
        setLongField(term151124, term151124.getClass(), "id", 34771316986040907L);
        setField(term151124, term151124.getClass(), "extId", term151126);
        setField(term151124, term151124.getClass(), "luid", "PwyEzyzkFI");
        setIntField(term151141, term151141.getClass(), "year", 2018);
        setShortField(term151141, term151141.getClass(), "month", (short) 1);
        setShortField(term151141, term151141.getClass(), "day", (short) 24);
        setField(term151140, term151140.getClass(), "date", term151141);
        setByteField(term151145, term151145.getClass(), "hour", (byte) 11);
        setByteField(term151145, term151145.getClass(), "minute", (byte) 50);
        setByteField(term151145, term151145.getClass(), "second", (byte) 41);
        setIntField(term151145, term151145.getClass(), "nano", 402572098);
        setField(term151140, term151140.getClass(), "time", term151145);
        setField(term151124, term151124.getClass(), "registerTime", term151140);
        setIntField(term151151, term151151.getClass(), "year", 2021);
        setShortField(term151151, term151151.getClass(), "month", (short) 11);
        setShortField(term151151, term151151.getClass(), "day", (short) 14);
        setField(term151150, term151150.getClass(), "date", term151151);
        setByteField(term151155, term151155.getClass(), "hour", (byte) 3);
        setByteField(term151155, term151155.getClass(), "minute", (byte) 30);
        setByteField(term151155, term151155.getClass(), "second", (byte) 36);
        setIntField(term151155, term151155.getClass(), "nano", 680228713);
        setField(term151150, term151150.getClass(), "time", term151155);
        setField(term151124, term151124.getClass(), "accessTime", term151150);
        setField(term151122, term151122.getClass(), "card", term151124);
        setField(term151122, term151122.getClass(), "userName", "QyBqhwjZjI");
        setIntField(term151122, term151122.getClass(), "level", -1313938080);
        setIntField(term151122, term151122.getClass(), "reincarnationNum", -2070649848);
        setLongField(term151122, term151122.getClass(), "exp", 2555076423360346949L);
        setLongField(term151122, term151122.getClass(), "point", 4097039108785248322L);
        setLongField(term151122, term151122.getClass(), "totalPoint", 1817490469232226997L);
        setIntField(term151122, term151122.getClass(), "playCount", -291029205);
        setIntField(term151122, term151122.getClass(), "jewelCount", 929711065);
        setIntField(term151122, term151122.getClass(), "totalJewelCount", -1034367222);
        setIntField(term151122, term151122.getClass(), "medalCount", 1086994460);
        setIntField(term151122, term151122.getClass(), "playerRating", 434127670);
        setIntField(term151122, term151122.getClass(), "highestRating", -1916016616);
        setIntField(term151122, term151122.getClass(), "battlePoint", -24073374);
        setIntField(term151122, term151122.getClass(), "bestBattlePoint", -1683460380);
        setIntField(term151122, term151122.getClass(), "overDamageBattlePoint", -1328582865);
        setBooleanField(term151122, term151122.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term151122, term151122.getClass(), "nameplateId", -2124482280);
        setIntField(term151122, term151122.getClass(), "trophyId", -559363939);
        setIntField(term151122, term151122.getClass(), "cardId", 477002993);
        setIntField(term151122, term151122.getClass(), "characterId", -1566937884);
        setIntField(term151122, term151122.getClass(), "characterVoiceNo", 18844455);
        setIntField(term151122, term151122.getClass(), "tabSetting", -104376222);
        setIntField(term151122, term151122.getClass(), "tabSortSetting", -910208002);
        setIntField(term151122, term151122.getClass(), "cardCategorySetting", 1779017343);
        setIntField(term151122, term151122.getClass(), "cardSortSetting", 1035172702);
        setIntField(term151122, term151122.getClass(), "rivalScoreCategorySetting", -2014376784);
        setIntField(term151122, term151122.getClass(), "playedTutorialBit", -1636759557);
        setIntField(term151122, term151122.getClass(), "firstTutorialCancelNum", -558790646);
        setLongField(term151122, term151122.getClass(), "sumTechHighScore", -202113049977579583L);
        setLongField(term151122, term151122.getClass(), "sumTechBasicHighScore", 8174608334395320719L);
        setLongField(term151122, term151122.getClass(), "sumTechAdvancedHighScore", -556919287843534913L);
        setLongField(term151122, term151122.getClass(), "sumTechExpertHighScore", -7294326942818969653L);
        setLongField(term151122, term151122.getClass(), "sumTechMasterHighScore", 8962346707049260171L);
        setLongField(term151122, term151122.getClass(), "sumTechLunaticHighScore", -6761022409110141883L);
        setLongField(term151122, term151122.getClass(), "sumBattleHighScore", -8253392951282694419L);
        setLongField(term151122, term151122.getClass(), "sumBattleBasicHighScore", 5170380277584505467L);
        setLongField(term151122, term151122.getClass(), "sumBattleAdvancedHighScore", 6871100950577596810L);
        setLongField(term151122, term151122.getClass(), "sumBattleExpertHighScore", 5783239372469450901L);
        setLongField(term151122, term151122.getClass(), "sumBattleMasterHighScore", 4405936896727212172L);
        setLongField(term151122, term151122.getClass(), "sumBattleLunaticHighScore", 9201873154937989540L);
        setField(term151122, term151122.getClass(), "eventWatchedDate", "WTJsUQWrPu");
        setField(term151122, term151122.getClass(), "cmEventWatchedDate", "IwDJSFYrvd");
        setField(term151122, term151122.getClass(), "firstGameId", "zIcvqyfLta");
        setField(term151122, term151122.getClass(), "firstRomVersion", "HAReZkXopn");
        setField(term151122, term151122.getClass(), "firstDataVersion", "clSasMmBlm");
        setField(term151122, term151122.getClass(), "firstPlayDate", "BVIBVYApBG");
        setField(term151122, term151122.getClass(), "lastGameId", "rDMARKSlyU");
        setField(term151122, term151122.getClass(), "lastRomVersion", "pdwBEXDsZz");
        setField(term151122, term151122.getClass(), "lastDataVersion", "ODCEExTkfn");
        setField(term151122, term151122.getClass(), "compatibleCmVersion", "WGInnBoBXb");
        setField(term151122, term151122.getClass(), "lastPlayDate", "zRdVDyYqUh");
        setIntField(term151122, term151122.getClass(), "lastPlaceId", -1501041458);
        setField(term151122, term151122.getClass(), "lastPlaceName", "hsHZkWJHpU");
        setIntField(term151122, term151122.getClass(), "lastRegionId", 704257790);
        setField(term151122, term151122.getClass(), "lastRegionName", "jACNZKsTgs");
        setIntField(term151122, term151122.getClass(), "lastAllNetId", 84488553);
        setField(term151122, term151122.getClass(), "lastClientId", "gdXejOZMlf");
        setIntField(term151122, term151122.getClass(), "lastUsedDeckId", 112186676);
        setIntField(term151122, term151122.getClass(), "lastPlayMusicLevel", 1529668856);
        setIntField(term151122, term151122.getClass(), "lastEmoneyBrand", 1327244707);
        setField(term151120, term151120.getClass(), "user", term151122);
        setIntField(term151120, term151120.getClass(), "chapterId", 636264680);
        setIntField(term151120, term151120.getClass(), "tradeItemId", 549590868);
        setIntField(term151120, term151120.getClass(), "tradeCount", -2123777150);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTradeItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUser", argTypes, term151120, args);
    }

};


