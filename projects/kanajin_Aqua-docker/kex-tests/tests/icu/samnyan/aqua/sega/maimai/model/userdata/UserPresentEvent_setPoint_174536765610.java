package icu.samnyan.aqua.sega.maimai.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;
import java.lang.Integer;

public class UserPresentEvent_setPoint_174536765610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99601;
     Object term99781;

    public UserPresentEvent_setPoint_174536765610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term99607 = new Long(7800835025296877231L);
        term99601 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPresentEvent"));
        Object term99603 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term99605 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term99621 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term99622 = newInstance(Class.forName("java.time.LocalDate"));
        Object term99626 = newInstance(Class.forName("java.time.LocalTime"));
        Object term99631 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term99632 = newInstance(Class.forName("java.time.LocalDate"));
        Object term99636 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term99601, term99601.getClass(), "id", -723301799439650268L);
        setLongField(term99603, term99603.getClass(), "id", 7218261959613569082L);
        setLongField(term99605, term99605.getClass(), "id", 8997626143537750821L);
        setField(term99605, term99605.getClass(), "extId", term99607);
        setField(term99605, term99605.getClass(), "luid", "IJXeeXjhgd");
        setIntField(term99622, term99622.getClass(), "year", 2028);
        setShortField(term99622, term99622.getClass(), "month", (short) 2);
        setShortField(term99622, term99622.getClass(), "day", (short) 8);
        setField(term99621, term99621.getClass(), "date", term99622);
        setByteField(term99626, term99626.getClass(), "hour", (byte) 12);
        setByteField(term99626, term99626.getClass(), "minute", (byte) 27);
        setByteField(term99626, term99626.getClass(), "second", (byte) 18);
        setIntField(term99626, term99626.getClass(), "nano", 853147382);
        setField(term99621, term99621.getClass(), "time", term99626);
        setField(term99605, term99605.getClass(), "registerTime", term99621);
        setIntField(term99632, term99632.getClass(), "year", 2028);
        setShortField(term99632, term99632.getClass(), "month", (short) 10);
        setShortField(term99632, term99632.getClass(), "day", (short) 3);
        setField(term99631, term99631.getClass(), "date", term99632);
        setByteField(term99636, term99636.getClass(), "hour", (byte) 22);
        setByteField(term99636, term99636.getClass(), "minute", (byte) 20);
        setByteField(term99636, term99636.getClass(), "second", (byte) 16);
        setIntField(term99636, term99636.getClass(), "nano", 358560291);
        setField(term99631, term99631.getClass(), "time", term99636);
        setField(term99605, term99605.getClass(), "accessTime", term99631);
        setField(term99603, term99603.getClass(), "card", term99605);
        setIntField(term99603, term99603.getClass(), "lastDataVersion", -1565053891);
        setField(term99603, term99603.getClass(), "userName", "QTDAUOmsVV");
        setIntField(term99603, term99603.getClass(), "point", -33830392);
        setIntField(term99603, term99603.getClass(), "totalPoint", -278532668);
        setIntField(term99603, term99603.getClass(), "iconId", -1649190427);
        setIntField(term99603, term99603.getClass(), "nameplateId", 2072156352);
        setIntField(term99603, term99603.getClass(), "frameId", -681832040);
        setIntField(term99603, term99603.getClass(), "trophyId", 2046403159);
        setIntField(term99603, term99603.getClass(), "playCount", 796789689);
        setIntField(term99603, term99603.getClass(), "playVsCount", 410056120);
        setIntField(term99603, term99603.getClass(), "playSyncCount", -1155278855);
        setIntField(term99603, term99603.getClass(), "winCount", 851040269);
        setIntField(term99603, term99603.getClass(), "helpCount", 148663158);
        setIntField(term99603, term99603.getClass(), "comboCount", -1586841704);
        setIntField(term99603, term99603.getClass(), "feverCount", 1177959159);
        setIntField(term99603, term99603.getClass(), "totalHiScore", 1634229231);
        setIntField(term99603, term99603.getClass(), "totalEasyHighScore", 91169479);
        setIntField(term99603, term99603.getClass(), "totalBasicHighScore", 214492019);
        setIntField(term99603, term99603.getClass(), "totalAdvancedHighScore", -357230273);
        setIntField(term99603, term99603.getClass(), "totalExpertHighScore", -537888142);
        setIntField(term99603, term99603.getClass(), "totalMasterHighScore", -1600863169);
        setIntField(term99603, term99603.getClass(), "totalReMasterHighScore", -151268707);
        setIntField(term99603, term99603.getClass(), "totalHighSync", 687322930);
        setIntField(term99603, term99603.getClass(), "totalEasySync", -1091459660);
        setIntField(term99603, term99603.getClass(), "totalBasicSync", -729567674);
        setIntField(term99603, term99603.getClass(), "totalAdvancedSync", -1285026670);
        setIntField(term99603, term99603.getClass(), "totalExpertSync", -1081713412);
        setIntField(term99603, term99603.getClass(), "totalMasterSync", -698893307);
        setIntField(term99603, term99603.getClass(), "totalReMasterSync", -198530739);
        setIntField(term99603, term99603.getClass(), "playerRating", -820225259);
        setIntField(term99603, term99603.getClass(), "highestRating", -1310113307);
        setIntField(term99603, term99603.getClass(), "rankAuthTailId", 1548923560);
        setField(term99603, term99603.getClass(), "eventWatchedDate", "ODrpsXzKlX");
        setField(term99603, term99603.getClass(), "webLimitDate", "xxswizwuwy");
        setIntField(term99603, term99603.getClass(), "challengeTrackPhase", -624904888);
        setIntField(term99603, term99603.getClass(), "firstPlayBits", -2104329060);
        setField(term99603, term99603.getClass(), "lastPlayDate", "QbkfeBvHco");
        setIntField(term99603, term99603.getClass(), "lastPlaceId", 69884134);
        setField(term99603, term99603.getClass(), "lastPlaceName", "lLaCGEQqCV");
        setIntField(term99603, term99603.getClass(), "lastRegionId", 1238870233);
        setField(term99603, term99603.getClass(), "lastRegionName", "bYFQVigzOV");
        setField(term99603, term99603.getClass(), "lastClientId", "TXKwwgcTVt");
        setField(term99603, term99603.getClass(), "lastCountryCode", "FgaHDSytdu");
        setIntField(term99603, term99603.getClass(), "eventPoint", -1384138147);
        setIntField(term99603, term99603.getClass(), "totalLv", -421652245);
        setIntField(term99603, term99603.getClass(), "lastLoginBonusDay", 1322177151);
        setIntField(term99603, term99603.getClass(), "lastSurvivalBonusDay", 233940754);
        setIntField(term99603, term99603.getClass(), "loginBonusLv", 193794265);
        setField(term99601, term99601.getClass(), "user", term99603);
        setIntField(term99601, term99601.getClass(), "presentEventId", 851696638);
        setIntField(term99601, term99601.getClass(), "point", 101083079);
        setIntField(term99601, term99601.getClass(), "presentCount", -389509495);
        setIntField(term99601, term99601.getClass(), "rate", 1355682915);
        term99781 = new Integer(-143860949);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserPresentEvent");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term99781;
        callMethod(klass, "setPoint", argTypes, term99601, args);
    }

};


