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

public class UserDetail_setFirstGameId_2037970836119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term262721;

    public UserDetail_setFirstGameId_2037970836119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term262725 = new Long(8527367353497875781L);
        ArrayList term262786 = new ArrayList();
        Integer term262792 = new Integer(-2022370596);
        Integer term262794 = new Integer(856428856);
        Integer term262796 = new Integer(1295040350);
        ArrayList term262790 = new ArrayList();
        ((ArrayList) term262790).add(term262792);
        ((ArrayList) term262790).add(term262794);
        ((ArrayList) term262790).add(term262796);
        term262721 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term262723 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term262739 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term262740 = newInstance(Class.forName("java.time.LocalDate"));
        Object term262744 = newInstance(Class.forName("java.time.LocalTime"));
        Object term262749 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term262750 = newInstance(Class.forName("java.time.LocalDate"));
        Object term262754 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term262721, term262721.getClass(), "id", 954783434318546297L);
        setLongField(term262723, term262723.getClass(), "id", 6156124227773876419L);
        setField(term262723, term262723.getClass(), "extId", term262725);
        setField(term262723, term262723.getClass(), "luid", "CctsyEvwWN");
        setIntField(term262740, term262740.getClass(), "year", 2010);
        setShortField(term262740, term262740.getClass(), "month", (short) 5);
        setShortField(term262740, term262740.getClass(), "day", (short) 25);
        setField(term262739, term262739.getClass(), "date", term262740);
        setByteField(term262744, term262744.getClass(), "hour", (byte) 17);
        setByteField(term262744, term262744.getClass(), "minute", (byte) 23);
        setByteField(term262744, term262744.getClass(), "second", (byte) 21);
        setIntField(term262744, term262744.getClass(), "nano", 681441380);
        setField(term262739, term262739.getClass(), "time", term262744);
        setField(term262723, term262723.getClass(), "registerTime", term262739);
        setIntField(term262750, term262750.getClass(), "year", 2019);
        setShortField(term262750, term262750.getClass(), "month", (short) 11);
        setShortField(term262750, term262750.getClass(), "day", (short) 2);
        setField(term262749, term262749.getClass(), "date", term262750);
        setByteField(term262754, term262754.getClass(), "hour", (byte) 0);
        setByteField(term262754, term262754.getClass(), "minute", (byte) 49);
        setByteField(term262754, term262754.getClass(), "second", (byte) 45);
        setIntField(term262754, term262754.getClass(), "nano", 193831568);
        setField(term262749, term262749.getClass(), "time", term262754);
        setField(term262723, term262723.getClass(), "accessTime", term262749);
        setField(term262721, term262721.getClass(), "card", term262723);
        setField(term262721, term262721.getClass(), "userName", "DZhtgksRJV");
        setIntField(term262721, term262721.getClass(), "isNetMember", 281863283);
        setIntField(term262721, term262721.getClass(), "iconId", 476670805);
        setIntField(term262721, term262721.getClass(), "plateId", 992401864);
        setIntField(term262721, term262721.getClass(), "titleId", -1159054979);
        setIntField(term262721, term262721.getClass(), "partnerId", 408150067);
        setIntField(term262721, term262721.getClass(), "frameId", 591636524);
        setIntField(term262721, term262721.getClass(), "selectMapId", 568699873);
        setIntField(term262721, term262721.getClass(), "totalAwake", -1785686568);
        setIntField(term262721, term262721.getClass(), "gradeRating", 1294837262);
        setIntField(term262721, term262721.getClass(), "musicRating", -215632827);
        setIntField(term262721, term262721.getClass(), "playerRating", 184055783);
        setIntField(term262721, term262721.getClass(), "highestRating", -1639833487);
        setIntField(term262721, term262721.getClass(), "gradeRank", -84743336);
        setIntField(term262721, term262721.getClass(), "classRank", -1199014315);
        setIntField(term262721, term262721.getClass(), "courseRank", -910275560);
        setField(term262721, term262721.getClass(), "charaSlot", term262786);
        setField(term262721, term262721.getClass(), "charaLockSlot", term262790);
        setLongField(term262721, term262721.getClass(), "contentBit", 339306863841941365L);
        setIntField(term262721, term262721.getClass(), "playCount", 1648183622);
        setField(term262721, term262721.getClass(), "eventWatchedDate", "kEOZgldknG");
        setField(term262721, term262721.getClass(), "lastGameId", "TgjFBWvVUx");
        setField(term262721, term262721.getClass(), "lastRomVersion", "qyZMBaqUiw");
        setField(term262721, term262721.getClass(), "lastDataVersion", "LScHUVQpVE");
        setField(term262721, term262721.getClass(), "lastLoginDate", "FbQsgUOoDY");
        setField(term262721, term262721.getClass(), "lastPlayDate", "xUMqyqCvcb");
        setIntField(term262721, term262721.getClass(), "lastPlayCredit", -1008570265);
        setIntField(term262721, term262721.getClass(), "lastPlayMode", -1462411830);
        setIntField(term262721, term262721.getClass(), "lastPlaceId", 186052697);
        setField(term262721, term262721.getClass(), "lastPlaceName", "UQNPJMVgtC");
        setIntField(term262721, term262721.getClass(), "lastAllNetId", 554356747);
        setIntField(term262721, term262721.getClass(), "lastRegionId", -1090542678);
        setField(term262721, term262721.getClass(), "lastRegionName", "YxqBgErhNo");
        setField(term262721, term262721.getClass(), "lastClientId", "WquZFpGWYY");
        setField(term262721, term262721.getClass(), "lastCountryCode", "DVdLunspbQ");
        setIntField(term262721, term262721.getClass(), "lastSelectEMoney", 174422614);
        setIntField(term262721, term262721.getClass(), "lastSelectTicket", 433230186);
        setIntField(term262721, term262721.getClass(), "lastSelectCourse", -1345691314);
        setIntField(term262721, term262721.getClass(), "lastCountCourse", 705683968);
        setField(term262721, term262721.getClass(), "firstGameId", "OUQVWAHprD");
        setField(term262721, term262721.getClass(), "firstRomVersion", "ptFvDczffY");
        setField(term262721, term262721.getClass(), "firstDataVersion", "yDXeFOuvlq");
        setField(term262721, term262721.getClass(), "firstPlayDate", "gvnDtiMlxS");
        setField(term262721, term262721.getClass(), "compatibleCmVersion", "UQbUgGUwXM");
        setField(term262721, term262721.getClass(), "dailyBonusDate", "IsNPwCcyyl");
        setField(term262721, term262721.getClass(), "dailyCourseBonusDate", "zoWVYvefpE");
        setField(term262721, term262721.getClass(), "lastPairLoginDate", "qxWXWoDENr");
        setField(term262721, term262721.getClass(), "lastTrialPlayDate", "mEuPBmaYON");
        setIntField(term262721, term262721.getClass(), "playVsCount", -1433294930);
        setIntField(term262721, term262721.getClass(), "playSyncCount", -208376998);
        setIntField(term262721, term262721.getClass(), "winCount", -1110875685);
        setIntField(term262721, term262721.getClass(), "helpCount", 1354426438);
        setIntField(term262721, term262721.getClass(), "comboCount", 2029894030);
        setLongField(term262721, term262721.getClass(), "totalDeluxscore", -5577895591543822310L);
        setLongField(term262721, term262721.getClass(), "totalBasicDeluxscore", 171403039811059156L);
        setLongField(term262721, term262721.getClass(), "totalAdvancedDeluxscore", -81596236701261118L);
        setLongField(term262721, term262721.getClass(), "totalExpertDeluxscore", 8760037440437083734L);
        setLongField(term262721, term262721.getClass(), "totalMasterDeluxscore", 1159118933913430921L);
        setLongField(term262721, term262721.getClass(), "totalReMasterDeluxscore", -6771577708163180279L);
        setIntField(term262721, term262721.getClass(), "totalSync", 17901373);
        setIntField(term262721, term262721.getClass(), "totalBasicSync", -919565215);
        setIntField(term262721, term262721.getClass(), "totalAdvancedSync", 1095256626);
        setIntField(term262721, term262721.getClass(), "totalExpertSync", 410424321);
        setIntField(term262721, term262721.getClass(), "totalMasterSync", 1038671901);
        setIntField(term262721, term262721.getClass(), "totalReMasterSync", 540755284);
        setLongField(term262721, term262721.getClass(), "totalAchievement", 8527894285348400597L);
        setLongField(term262721, term262721.getClass(), "totalBasicAchievement", 6053927648101054187L);
        setLongField(term262721, term262721.getClass(), "totalAdvancedAchievement", 5054095712343348969L);
        setLongField(term262721, term262721.getClass(), "totalExpertAchievement", 8633384495506562772L);
        setLongField(term262721, term262721.getClass(), "totalMasterAchievement", -2214174245165666457L);
        setLongField(term262721, term262721.getClass(), "totalReMasterAchievement", -2851380277240351598L);
        setLongField(term262721, term262721.getClass(), "playerOldRating", 4875247293969008917L);
        setLongField(term262721, term262721.getClass(), "playerNewRating", 5389602279897548373L);
        setIntField(term262721, term262721.getClass(), "banState", 347931231);
        setLongField(term262721, term262721.getClass(), "dateTime", 1938648836994434275L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ObPGyohonw";
        callMethod(klass, "setFirstGameId", argTypes, term262721, args);
    }

};


