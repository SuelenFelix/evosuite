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

public class UserDetail_setLastPlayCredit_2043028189105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term255203;
     Object term255558;

    public UserDetail_setLastPlayCredit_2043028189105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term255207 = new Long(6142089107139955834L);
        Integer term255270 = new Integer(-427688960);
        Integer term255272 = new Integer(343387902);
        Integer term255274 = new Integer(1492345954);
        Integer term255276 = new Integer(1891017572);
        Integer term255278 = new Integer(-391361805);
        Integer term255280 = new Integer(1171290917);
        Integer term255282 = new Integer(267258768);
        Integer term255284 = new Integer(1779008869);
        ArrayList term255268 = new ArrayList();
        ((ArrayList) term255268).add(term255270);
        ((ArrayList) term255268).add(term255272);
        ((ArrayList) term255268).add(term255274);
        ((ArrayList) term255268).add(term255276);
        ((ArrayList) term255268).add(term255278);
        ((ArrayList) term255268).add(term255280);
        ((ArrayList) term255268).add(term255282);
        ((ArrayList) term255268).add(term255284);
        ArrayList term255288 = new ArrayList();
        term255203 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term255205 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term255221 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term255222 = newInstance(Class.forName("java.time.LocalDate"));
        Object term255226 = newInstance(Class.forName("java.time.LocalTime"));
        Object term255231 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term255232 = newInstance(Class.forName("java.time.LocalDate"));
        Object term255236 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term255203, term255203.getClass(), "id", -1039152628227229076L);
        setLongField(term255205, term255205.getClass(), "id", -1822127913011503842L);
        setField(term255205, term255205.getClass(), "extId", term255207);
        setField(term255205, term255205.getClass(), "luid", "fdERpSvfXR");
        setIntField(term255222, term255222.getClass(), "year", 2015);
        setShortField(term255222, term255222.getClass(), "month", (short) 7);
        setShortField(term255222, term255222.getClass(), "day", (short) 20);
        setField(term255221, term255221.getClass(), "date", term255222);
        setByteField(term255226, term255226.getClass(), "hour", (byte) 12);
        setByteField(term255226, term255226.getClass(), "minute", (byte) 3);
        setByteField(term255226, term255226.getClass(), "second", (byte) 51);
        setIntField(term255226, term255226.getClass(), "nano", 425566548);
        setField(term255221, term255221.getClass(), "time", term255226);
        setField(term255205, term255205.getClass(), "registerTime", term255221);
        setIntField(term255232, term255232.getClass(), "year", 2029);
        setShortField(term255232, term255232.getClass(), "month", (short) 10);
        setShortField(term255232, term255232.getClass(), "day", (short) 28);
        setField(term255231, term255231.getClass(), "date", term255232);
        setByteField(term255236, term255236.getClass(), "hour", (byte) 3);
        setByteField(term255236, term255236.getClass(), "minute", (byte) 8);
        setByteField(term255236, term255236.getClass(), "second", (byte) 59);
        setIntField(term255236, term255236.getClass(), "nano", 94100073);
        setField(term255231, term255231.getClass(), "time", term255236);
        setField(term255205, term255205.getClass(), "accessTime", term255231);
        setField(term255203, term255203.getClass(), "card", term255205);
        setField(term255203, term255203.getClass(), "userName", "hOUYxUxiHr");
        setIntField(term255203, term255203.getClass(), "isNetMember", -310618122);
        setIntField(term255203, term255203.getClass(), "iconId", 958693869);
        setIntField(term255203, term255203.getClass(), "plateId", -1432088699);
        setIntField(term255203, term255203.getClass(), "titleId", -371554324);
        setIntField(term255203, term255203.getClass(), "partnerId", 778866266);
        setIntField(term255203, term255203.getClass(), "frameId", 76351450);
        setIntField(term255203, term255203.getClass(), "selectMapId", -1112309026);
        setIntField(term255203, term255203.getClass(), "totalAwake", -180876065);
        setIntField(term255203, term255203.getClass(), "gradeRating", -272580985);
        setIntField(term255203, term255203.getClass(), "musicRating", -368107042);
        setIntField(term255203, term255203.getClass(), "playerRating", 254702754);
        setIntField(term255203, term255203.getClass(), "highestRating", 1741425842);
        setIntField(term255203, term255203.getClass(), "gradeRank", 1246423782);
        setIntField(term255203, term255203.getClass(), "classRank", 142997582);
        setIntField(term255203, term255203.getClass(), "courseRank", -392460851);
        setField(term255203, term255203.getClass(), "charaSlot", term255268);
        setField(term255203, term255203.getClass(), "charaLockSlot", term255288);
        setLongField(term255203, term255203.getClass(), "contentBit", 5688838977157689250L);
        setIntField(term255203, term255203.getClass(), "playCount", -919411937);
        setField(term255203, term255203.getClass(), "eventWatchedDate", "enxtAKeukF");
        setField(term255203, term255203.getClass(), "lastGameId", "BtZDkCvyCl");
        setField(term255203, term255203.getClass(), "lastRomVersion", "EMcBwIYzOV");
        setField(term255203, term255203.getClass(), "lastDataVersion", "IuZuqYNKVu");
        setField(term255203, term255203.getClass(), "lastLoginDate", "UhFHtcXzAx");
        setField(term255203, term255203.getClass(), "lastPlayDate", "cDCGHIFISc");
        setIntField(term255203, term255203.getClass(), "lastPlayCredit", 2038726156);
        setIntField(term255203, term255203.getClass(), "lastPlayMode", 1896474985);
        setIntField(term255203, term255203.getClass(), "lastPlaceId", -847986277);
        setField(term255203, term255203.getClass(), "lastPlaceName", "ZRaaeHguys");
        setIntField(term255203, term255203.getClass(), "lastAllNetId", 1293365107);
        setIntField(term255203, term255203.getClass(), "lastRegionId", -405022162);
        setField(term255203, term255203.getClass(), "lastRegionName", "JyyGlEhItv");
        setField(term255203, term255203.getClass(), "lastClientId", "NAeiHxWYxI");
        setField(term255203, term255203.getClass(), "lastCountryCode", "qSfOhoIMpr");
        setIntField(term255203, term255203.getClass(), "lastSelectEMoney", -372714052);
        setIntField(term255203, term255203.getClass(), "lastSelectTicket", -367920107);
        setIntField(term255203, term255203.getClass(), "lastSelectCourse", 644157843);
        setIntField(term255203, term255203.getClass(), "lastCountCourse", 1543957460);
        setField(term255203, term255203.getClass(), "firstGameId", "bAowmWKEGP");
        setField(term255203, term255203.getClass(), "firstRomVersion", "GQZmnRhLyF");
        setField(term255203, term255203.getClass(), "firstDataVersion", "CIJyIgGonf");
        setField(term255203, term255203.getClass(), "firstPlayDate", "uhIWNRNIgh");
        setField(term255203, term255203.getClass(), "compatibleCmVersion", "wFXoQDJRmN");
        setField(term255203, term255203.getClass(), "dailyBonusDate", "JYcRvcwyES");
        setField(term255203, term255203.getClass(), "dailyCourseBonusDate", "EIyXptwVyk");
        setField(term255203, term255203.getClass(), "lastPairLoginDate", "fgnBfpvzBR");
        setField(term255203, term255203.getClass(), "lastTrialPlayDate", "QGtfeKLTbS");
        setIntField(term255203, term255203.getClass(), "playVsCount", -1075032377);
        setIntField(term255203, term255203.getClass(), "playSyncCount", 2009204207);
        setIntField(term255203, term255203.getClass(), "winCount", 1778758468);
        setIntField(term255203, term255203.getClass(), "helpCount", -2099268660);
        setIntField(term255203, term255203.getClass(), "comboCount", 1667337184);
        setLongField(term255203, term255203.getClass(), "totalDeluxscore", 4468836627895647213L);
        setLongField(term255203, term255203.getClass(), "totalBasicDeluxscore", 3889018420218599956L);
        setLongField(term255203, term255203.getClass(), "totalAdvancedDeluxscore", -4971689733390294595L);
        setLongField(term255203, term255203.getClass(), "totalExpertDeluxscore", -164567610989084359L);
        setLongField(term255203, term255203.getClass(), "totalMasterDeluxscore", -1740536708305973855L);
        setLongField(term255203, term255203.getClass(), "totalReMasterDeluxscore", -4519826032504008283L);
        setIntField(term255203, term255203.getClass(), "totalSync", 824363409);
        setIntField(term255203, term255203.getClass(), "totalBasicSync", -386686554);
        setIntField(term255203, term255203.getClass(), "totalAdvancedSync", 271252577);
        setIntField(term255203, term255203.getClass(), "totalExpertSync", 103893335);
        setIntField(term255203, term255203.getClass(), "totalMasterSync", 171287923);
        setIntField(term255203, term255203.getClass(), "totalReMasterSync", -142820607);
        setLongField(term255203, term255203.getClass(), "totalAchievement", 6736342131876134132L);
        setLongField(term255203, term255203.getClass(), "totalBasicAchievement", -3280121169777496985L);
        setLongField(term255203, term255203.getClass(), "totalAdvancedAchievement", 126177232662963029L);
        setLongField(term255203, term255203.getClass(), "totalExpertAchievement", 8576154177707378867L);
        setLongField(term255203, term255203.getClass(), "totalMasterAchievement", -982280450215518478L);
        setLongField(term255203, term255203.getClass(), "totalReMasterAchievement", -7240053863373648960L);
        setLongField(term255203, term255203.getClass(), "playerOldRating", -4315969753843766007L);
        setLongField(term255203, term255203.getClass(), "playerNewRating", -5115716757097727245L);
        setIntField(term255203, term255203.getClass(), "banState", -101143092);
        setLongField(term255203, term255203.getClass(), "dateTime", 1232830493048431276L);
        term255558 = new Integer(-481036838);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term255558;
        callMethod(klass, "setLastPlayCredit", argTypes, term255203, args);
    }

};


