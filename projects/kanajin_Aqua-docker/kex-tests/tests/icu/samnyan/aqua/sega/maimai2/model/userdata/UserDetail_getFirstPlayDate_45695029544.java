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

public class UserDetail_getFirstPlayDate_45695029544 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4254458;

    public UserDetail_getFirstPlayDate_45695029544() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4254462 = new Long(-6850104699394939381L);
        ArrayList term4254523 = new ArrayList();
        Integer term4254529 = new Integer(571250476);
        Integer term4254531 = new Integer(850454258);
        ArrayList term4254527 = new ArrayList();
        ((ArrayList) term4254527).add(term4254529);
        ((ArrayList) term4254527).add(term4254531);
        term4254458 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4254460 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4254476 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4254477 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4254481 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4254486 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4254487 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4254491 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4254458, term4254458.getClass(), "id", -8571414964615345563L);
        setLongField(term4254460, term4254460.getClass(), "id", 7344290163487370361L);
        setField(term4254460, term4254460.getClass(), "extId", term4254462);
        setField(term4254460, term4254460.getClass(), "luid", "NjprRIvtnI");
        setIntField(term4254477, term4254477.getClass(), "year", 2019);
        setShortField(term4254477, term4254477.getClass(), "month", (short) 3);
        setShortField(term4254477, term4254477.getClass(), "day", (short) 24);
        setField(term4254476, term4254476.getClass(), "date", term4254477);
        setByteField(term4254481, term4254481.getClass(), "hour", (byte) 4);
        setByteField(term4254481, term4254481.getClass(), "minute", (byte) 8);
        setByteField(term4254481, term4254481.getClass(), "second", (byte) 5);
        setIntField(term4254481, term4254481.getClass(), "nano", 917817360);
        setField(term4254476, term4254476.getClass(), "time", term4254481);
        setField(term4254460, term4254460.getClass(), "registerTime", term4254476);
        setIntField(term4254487, term4254487.getClass(), "year", 2012);
        setShortField(term4254487, term4254487.getClass(), "month", (short) 1);
        setShortField(term4254487, term4254487.getClass(), "day", (short) 25);
        setField(term4254486, term4254486.getClass(), "date", term4254487);
        setByteField(term4254491, term4254491.getClass(), "hour", (byte) 1);
        setByteField(term4254491, term4254491.getClass(), "minute", (byte) 0);
        setByteField(term4254491, term4254491.getClass(), "second", (byte) 9);
        setIntField(term4254491, term4254491.getClass(), "nano", 327152531);
        setField(term4254486, term4254486.getClass(), "time", term4254491);
        setField(term4254460, term4254460.getClass(), "accessTime", term4254486);
        setField(term4254458, term4254458.getClass(), "card", term4254460);
        setField(term4254458, term4254458.getClass(), "userName", "vlERjeWFWE");
        setIntField(term4254458, term4254458.getClass(), "isNetMember", 777804050);
        setIntField(term4254458, term4254458.getClass(), "iconId", 74206484);
        setIntField(term4254458, term4254458.getClass(), "plateId", 1252742746);
        setIntField(term4254458, term4254458.getClass(), "titleId", -1107901426);
        setIntField(term4254458, term4254458.getClass(), "partnerId", 1797573459);
        setIntField(term4254458, term4254458.getClass(), "frameId", -1141127736);
        setIntField(term4254458, term4254458.getClass(), "selectMapId", -402128915);
        setIntField(term4254458, term4254458.getClass(), "totalAwake", -496730695);
        setIntField(term4254458, term4254458.getClass(), "gradeRating", 789401669);
        setIntField(term4254458, term4254458.getClass(), "musicRating", -1506143420);
        setIntField(term4254458, term4254458.getClass(), "playerRating", -150105402);
        setIntField(term4254458, term4254458.getClass(), "highestRating", -1067793864);
        setIntField(term4254458, term4254458.getClass(), "gradeRank", -1625008483);
        setIntField(term4254458, term4254458.getClass(), "classRank", 1786893257);
        setIntField(term4254458, term4254458.getClass(), "courseRank", 1107821924);
        setField(term4254458, term4254458.getClass(), "charaSlot", term4254523);
        setField(term4254458, term4254458.getClass(), "charaLockSlot", term4254527);
        setLongField(term4254458, term4254458.getClass(), "contentBit", -4429992117881403733L);
        setIntField(term4254458, term4254458.getClass(), "playCount", -1477276461);
        setField(term4254458, term4254458.getClass(), "eventWatchedDate", "htRREsRYNG");
        setField(term4254458, term4254458.getClass(), "lastGameId", "NOknsGmALP");
        setField(term4254458, term4254458.getClass(), "lastRomVersion", "nQZvZcnMsV");
        setField(term4254458, term4254458.getClass(), "lastDataVersion", "rcgIcZycdg");
        setField(term4254458, term4254458.getClass(), "lastLoginDate", "MsURXIthuq");
        setField(term4254458, term4254458.getClass(), "lastPlayDate", "EwcKPearpe");
        setIntField(term4254458, term4254458.getClass(), "lastPlayCredit", 398225717);
        setIntField(term4254458, term4254458.getClass(), "lastPlayMode", 795764579);
        setIntField(term4254458, term4254458.getClass(), "lastPlaceId", 1526177911);
        setField(term4254458, term4254458.getClass(), "lastPlaceName", "BdtBALLyjB");
        setIntField(term4254458, term4254458.getClass(), "lastAllNetId", -824299299);
        setIntField(term4254458, term4254458.getClass(), "lastRegionId", -1469330638);
        setField(term4254458, term4254458.getClass(), "lastRegionName", "WiUcuHVvoW");
        setField(term4254458, term4254458.getClass(), "lastClientId", "PrpaeLEZLl");
        setField(term4254458, term4254458.getClass(), "lastCountryCode", "wpDgzEVeQs");
        setIntField(term4254458, term4254458.getClass(), "lastSelectEMoney", 841530170);
        setIntField(term4254458, term4254458.getClass(), "lastSelectTicket", 1331759523);
        setIntField(term4254458, term4254458.getClass(), "lastSelectCourse", -1369831639);
        setIntField(term4254458, term4254458.getClass(), "lastCountCourse", -833865113);
        setField(term4254458, term4254458.getClass(), "firstGameId", "LDESVpwMMg");
        setField(term4254458, term4254458.getClass(), "firstRomVersion", "yWrZTmtnEr");
        setField(term4254458, term4254458.getClass(), "firstDataVersion", "aOeQPbdnJt");
        setField(term4254458, term4254458.getClass(), "firstPlayDate", "zYuyPVAPhH");
        setField(term4254458, term4254458.getClass(), "compatibleCmVersion", "vnlaGntTtu");
        setField(term4254458, term4254458.getClass(), "dailyBonusDate", "juCyMAxCDL");
        setField(term4254458, term4254458.getClass(), "dailyCourseBonusDate", "DlWSfSzpZX");
        setField(term4254458, term4254458.getClass(), "lastPairLoginDate", "KJdHLgzucz");
        setField(term4254458, term4254458.getClass(), "lastTrialPlayDate", "JTitsxJdJd");
        setIntField(term4254458, term4254458.getClass(), "playVsCount", 1348793895);
        setIntField(term4254458, term4254458.getClass(), "playSyncCount", -1026771325);
        setIntField(term4254458, term4254458.getClass(), "winCount", 1282801341);
        setIntField(term4254458, term4254458.getClass(), "helpCount", 1044354044);
        setIntField(term4254458, term4254458.getClass(), "comboCount", -894051703);
        setLongField(term4254458, term4254458.getClass(), "totalDeluxscore", 6121459675490570610L);
        setLongField(term4254458, term4254458.getClass(), "totalBasicDeluxscore", 2685598428823137984L);
        setLongField(term4254458, term4254458.getClass(), "totalAdvancedDeluxscore", -9034206761234575868L);
        setLongField(term4254458, term4254458.getClass(), "totalExpertDeluxscore", 6770241774101649651L);
        setLongField(term4254458, term4254458.getClass(), "totalMasterDeluxscore", 6944784740198939488L);
        setLongField(term4254458, term4254458.getClass(), "totalReMasterDeluxscore", -2649664745946331024L);
        setIntField(term4254458, term4254458.getClass(), "totalSync", -1650717712);
        setIntField(term4254458, term4254458.getClass(), "totalBasicSync", -241498939);
        setIntField(term4254458, term4254458.getClass(), "totalAdvancedSync", 1997678410);
        setIntField(term4254458, term4254458.getClass(), "totalExpertSync", 2043933017);
        setIntField(term4254458, term4254458.getClass(), "totalMasterSync", -1149588094);
        setIntField(term4254458, term4254458.getClass(), "totalReMasterSync", 32143306);
        setLongField(term4254458, term4254458.getClass(), "totalAchievement", 3977993432641178091L);
        setLongField(term4254458, term4254458.getClass(), "totalBasicAchievement", 2865635277479492221L);
        setLongField(term4254458, term4254458.getClass(), "totalAdvancedAchievement", -8748389715874653666L);
        setLongField(term4254458, term4254458.getClass(), "totalExpertAchievement", -495015299191045120L);
        setLongField(term4254458, term4254458.getClass(), "totalMasterAchievement", -231179430422429778L);
        setLongField(term4254458, term4254458.getClass(), "totalReMasterAchievement", -2705992325386173628L);
        setLongField(term4254458, term4254458.getClass(), "playerOldRating", -298839832035208468L);
        setLongField(term4254458, term4254458.getClass(), "playerNewRating", -6245523624436635140L);
        setIntField(term4254458, term4254458.getClass(), "banState", 1552909065);
        setLongField(term4254458, term4254458.getClass(), "dateTime", -5979225153616710547L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFirstPlayDate", argTypes, term4254458, args);
    }

};


