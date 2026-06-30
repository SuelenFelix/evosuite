package icu.samnyan.aqua.sega.maimai2.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai2.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;
import java.util.ArrayList;
import java.lang.Integer;

public class UserDetail_setLastPlayCredit_2043028189106 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term255258;
     Object term255613;

    public UserDetail_setLastPlayCredit_2043028189106() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term255262 = new Long(6142089107139955834L);
        Integer term255325 = new Integer(-427688960);
        Integer term255327 = new Integer(343387902);
        Integer term255329 = new Integer(1492345954);
        Integer term255331 = new Integer(1891017572);
        Integer term255333 = new Integer(-391361805);
        Integer term255335 = new Integer(1171290917);
        Integer term255337 = new Integer(267258768);
        Integer term255339 = new Integer(1779008869);
        ArrayList term255323 = new ArrayList();
        ((ArrayList) term255323).add(term255325);
        ((ArrayList) term255323).add(term255327);
        ((ArrayList) term255323).add(term255329);
        ((ArrayList) term255323).add(term255331);
        ((ArrayList) term255323).add(term255333);
        ((ArrayList) term255323).add(term255335);
        ((ArrayList) term255323).add(term255337);
        ((ArrayList) term255323).add(term255339);
        ArrayList term255343 = new ArrayList();
        term255258 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term255260 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term255276 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term255277 = newInstance(Class.forName("java.time.LocalDate"));
        Object term255281 = newInstance(Class.forName("java.time.LocalTime"));
        Object term255286 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term255287 = newInstance(Class.forName("java.time.LocalDate"));
        Object term255291 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term255258, term255258.getClass(), "id", -1039152628227229076L);
        setLongField(term255260, term255260.getClass(), "id", -1822127913011503842L);
        setField(term255260, term255260.getClass(), "extId", term255262);
        setField(term255260, term255260.getClass(), "luid", "fdERpSvfXR");
        setIntField(term255277, term255277.getClass(), "year", 2015);
        setShortField(term255277, term255277.getClass(), "month", (short) 7);
        setShortField(term255277, term255277.getClass(), "day", (short) 20);
        setField(term255276, term255276.getClass(), "date", term255277);
        setByteField(term255281, term255281.getClass(), "hour", (byte) 12);
        setByteField(term255281, term255281.getClass(), "minute", (byte) 3);
        setByteField(term255281, term255281.getClass(), "second", (byte) 51);
        setIntField(term255281, term255281.getClass(), "nano", 425566548);
        setField(term255276, term255276.getClass(), "time", term255281);
        setField(term255260, term255260.getClass(), "registerTime", term255276);
        setIntField(term255287, term255287.getClass(), "year", 2029);
        setShortField(term255287, term255287.getClass(), "month", (short) 10);
        setShortField(term255287, term255287.getClass(), "day", (short) 28);
        setField(term255286, term255286.getClass(), "date", term255287);
        setByteField(term255291, term255291.getClass(), "hour", (byte) 3);
        setByteField(term255291, term255291.getClass(), "minute", (byte) 8);
        setByteField(term255291, term255291.getClass(), "second", (byte) 59);
        setIntField(term255291, term255291.getClass(), "nano", 94100073);
        setField(term255286, term255286.getClass(), "time", term255291);
        setField(term255260, term255260.getClass(), "accessTime", term255286);
        setField(term255258, term255258.getClass(), "card", term255260);
        setField(term255258, term255258.getClass(), "userName", "hOUYxUxiHr");
        setIntField(term255258, term255258.getClass(), "isNetMember", -310618122);
        setIntField(term255258, term255258.getClass(), "iconId", 958693869);
        setIntField(term255258, term255258.getClass(), "plateId", -1432088699);
        setIntField(term255258, term255258.getClass(), "titleId", -371554324);
        setIntField(term255258, term255258.getClass(), "partnerId", 778866266);
        setIntField(term255258, term255258.getClass(), "frameId", 76351450);
        setIntField(term255258, term255258.getClass(), "selectMapId", -1112309026);
        setIntField(term255258, term255258.getClass(), "totalAwake", -180876065);
        setIntField(term255258, term255258.getClass(), "gradeRating", -272580985);
        setIntField(term255258, term255258.getClass(), "musicRating", -368107042);
        setIntField(term255258, term255258.getClass(), "playerRating", 254702754);
        setIntField(term255258, term255258.getClass(), "highestRating", 1741425842);
        setIntField(term255258, term255258.getClass(), "gradeRank", 1246423782);
        setIntField(term255258, term255258.getClass(), "classRank", 142997582);
        setIntField(term255258, term255258.getClass(), "courseRank", -392460851);
        setField(term255258, term255258.getClass(), "charaSlot", term255323);
        setField(term255258, term255258.getClass(), "charaLockSlot", term255343);
        setLongField(term255258, term255258.getClass(), "contentBit", 5688838977157689250L);
        setIntField(term255258, term255258.getClass(), "playCount", -919411937);
        setField(term255258, term255258.getClass(), "eventWatchedDate", "enxtAKeukF");
        setField(term255258, term255258.getClass(), "lastGameId", "BtZDkCvyCl");
        setField(term255258, term255258.getClass(), "lastRomVersion", "EMcBwIYzOV");
        setField(term255258, term255258.getClass(), "lastDataVersion", "IuZuqYNKVu");
        setField(term255258, term255258.getClass(), "lastLoginDate", "UhFHtcXzAx");
        setField(term255258, term255258.getClass(), "lastPlayDate", "cDCGHIFISc");
        setIntField(term255258, term255258.getClass(), "lastPlayCredit", 2038726156);
        setIntField(term255258, term255258.getClass(), "lastPlayMode", 1896474985);
        setIntField(term255258, term255258.getClass(), "lastPlaceId", -847986277);
        setField(term255258, term255258.getClass(), "lastPlaceName", "ZRaaeHguys");
        setIntField(term255258, term255258.getClass(), "lastAllNetId", 1293365107);
        setIntField(term255258, term255258.getClass(), "lastRegionId", -405022162);
        setField(term255258, term255258.getClass(), "lastRegionName", "JyyGlEhItv");
        setField(term255258, term255258.getClass(), "lastClientId", "NAeiHxWYxI");
        setField(term255258, term255258.getClass(), "lastCountryCode", "qSfOhoIMpr");
        setIntField(term255258, term255258.getClass(), "lastSelectEMoney", -372714052);
        setIntField(term255258, term255258.getClass(), "lastSelectTicket", -367920107);
        setIntField(term255258, term255258.getClass(), "lastSelectCourse", 644157843);
        setIntField(term255258, term255258.getClass(), "lastCountCourse", 1543957460);
        setField(term255258, term255258.getClass(), "firstGameId", "bAowmWKEGP");
        setField(term255258, term255258.getClass(), "firstRomVersion", "GQZmnRhLyF");
        setField(term255258, term255258.getClass(), "firstDataVersion", "CIJyIgGonf");
        setField(term255258, term255258.getClass(), "firstPlayDate", "uhIWNRNIgh");
        setField(term255258, term255258.getClass(), "compatibleCmVersion", "wFXoQDJRmN");
        setField(term255258, term255258.getClass(), "dailyBonusDate", "JYcRvcwyES");
        setField(term255258, term255258.getClass(), "dailyCourseBonusDate", "EIyXptwVyk");
        setField(term255258, term255258.getClass(), "lastPairLoginDate", "fgnBfpvzBR");
        setField(term255258, term255258.getClass(), "lastTrialPlayDate", "QGtfeKLTbS");
        setIntField(term255258, term255258.getClass(), "playVsCount", -1075032377);
        setIntField(term255258, term255258.getClass(), "playSyncCount", 2009204207);
        setIntField(term255258, term255258.getClass(), "winCount", 1778758468);
        setIntField(term255258, term255258.getClass(), "helpCount", -2099268660);
        setIntField(term255258, term255258.getClass(), "comboCount", 1667337184);
        setLongField(term255258, term255258.getClass(), "totalDeluxscore", 4468836627895647213L);
        setLongField(term255258, term255258.getClass(), "totalBasicDeluxscore", 3889018420218599956L);
        setLongField(term255258, term255258.getClass(), "totalAdvancedDeluxscore", -4971689733390294595L);
        setLongField(term255258, term255258.getClass(), "totalExpertDeluxscore", -164567610989084359L);
        setLongField(term255258, term255258.getClass(), "totalMasterDeluxscore", -1740536708305973855L);
        setLongField(term255258, term255258.getClass(), "totalReMasterDeluxscore", -4519826032504008283L);
        setIntField(term255258, term255258.getClass(), "totalSync", 824363409);
        setIntField(term255258, term255258.getClass(), "totalBasicSync", -386686554);
        setIntField(term255258, term255258.getClass(), "totalAdvancedSync", 271252577);
        setIntField(term255258, term255258.getClass(), "totalExpertSync", 103893335);
        setIntField(term255258, term255258.getClass(), "totalMasterSync", 171287923);
        setIntField(term255258, term255258.getClass(), "totalReMasterSync", -142820607);
        setLongField(term255258, term255258.getClass(), "totalAchievement", 6736342131876134132L);
        setLongField(term255258, term255258.getClass(), "totalBasicAchievement", -3280121169777496985L);
        setLongField(term255258, term255258.getClass(), "totalAdvancedAchievement", 126177232662963029L);
        setLongField(term255258, term255258.getClass(), "totalExpertAchievement", 8576154177707378867L);
        setLongField(term255258, term255258.getClass(), "totalMasterAchievement", -982280450215518478L);
        setLongField(term255258, term255258.getClass(), "totalReMasterAchievement", -7240053863373648960L);
        setLongField(term255258, term255258.getClass(), "playerOldRating", -4315969753843766007L);
        setLongField(term255258, term255258.getClass(), "playerNewRating", -5115716757097727245L);
        setIntField(term255258, term255258.getClass(), "banState", -101143092);
        setLongField(term255258, term255258.getClass(), "dateTime", 1232830493048431276L);
        term255613 = new Integer(-481036838);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term255613;
        callMethod(klass, "setLastPlayCredit", argTypes, term255258, args);
    }

};


