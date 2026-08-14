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

public class UserDetail_setFirstGameId_2037970836118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term262666;

    public UserDetail_setFirstGameId_2037970836118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term262670 = new Long(8527367353497875781L);
        ArrayList term262731 = new ArrayList();
        Integer term262737 = new Integer(-2022370596);
        Integer term262739 = new Integer(856428856);
        Integer term262741 = new Integer(1295040350);
        ArrayList term262735 = new ArrayList();
        ((ArrayList) term262735).add(term262737);
        ((ArrayList) term262735).add(term262739);
        ((ArrayList) term262735).add(term262741);
        term262666 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term262668 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term262684 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term262685 = newInstance(Class.forName("java.time.LocalDate"));
        Object term262689 = newInstance(Class.forName("java.time.LocalTime"));
        Object term262694 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term262695 = newInstance(Class.forName("java.time.LocalDate"));
        Object term262699 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term262666, term262666.getClass(), "id", 954783434318546297L);
        setLongField(term262668, term262668.getClass(), "id", 6156124227773876419L);
        setField(term262668, term262668.getClass(), "extId", term262670);
        setField(term262668, term262668.getClass(), "luid", "CctsyEvwWN");
        setIntField(term262685, term262685.getClass(), "year", 2010);
        setShortField(term262685, term262685.getClass(), "month", (short) 5);
        setShortField(term262685, term262685.getClass(), "day", (short) 25);
        setField(term262684, term262684.getClass(), "date", term262685);
        setByteField(term262689, term262689.getClass(), "hour", (byte) 17);
        setByteField(term262689, term262689.getClass(), "minute", (byte) 23);
        setByteField(term262689, term262689.getClass(), "second", (byte) 21);
        setIntField(term262689, term262689.getClass(), "nano", 681441380);
        setField(term262684, term262684.getClass(), "time", term262689);
        setField(term262668, term262668.getClass(), "registerTime", term262684);
        setIntField(term262695, term262695.getClass(), "year", 2019);
        setShortField(term262695, term262695.getClass(), "month", (short) 11);
        setShortField(term262695, term262695.getClass(), "day", (short) 2);
        setField(term262694, term262694.getClass(), "date", term262695);
        setByteField(term262699, term262699.getClass(), "hour", (byte) 0);
        setByteField(term262699, term262699.getClass(), "minute", (byte) 49);
        setByteField(term262699, term262699.getClass(), "second", (byte) 45);
        setIntField(term262699, term262699.getClass(), "nano", 193831568);
        setField(term262694, term262694.getClass(), "time", term262699);
        setField(term262668, term262668.getClass(), "accessTime", term262694);
        setField(term262666, term262666.getClass(), "card", term262668);
        setField(term262666, term262666.getClass(), "userName", "DZhtgksRJV");
        setIntField(term262666, term262666.getClass(), "isNetMember", 281863283);
        setIntField(term262666, term262666.getClass(), "iconId", 476670805);
        setIntField(term262666, term262666.getClass(), "plateId", 992401864);
        setIntField(term262666, term262666.getClass(), "titleId", -1159054979);
        setIntField(term262666, term262666.getClass(), "partnerId", 408150067);
        setIntField(term262666, term262666.getClass(), "frameId", 591636524);
        setIntField(term262666, term262666.getClass(), "selectMapId", 568699873);
        setIntField(term262666, term262666.getClass(), "totalAwake", -1785686568);
        setIntField(term262666, term262666.getClass(), "gradeRating", 1294837262);
        setIntField(term262666, term262666.getClass(), "musicRating", -215632827);
        setIntField(term262666, term262666.getClass(), "playerRating", 184055783);
        setIntField(term262666, term262666.getClass(), "highestRating", -1639833487);
        setIntField(term262666, term262666.getClass(), "gradeRank", -84743336);
        setIntField(term262666, term262666.getClass(), "classRank", -1199014315);
        setIntField(term262666, term262666.getClass(), "courseRank", -910275560);
        setField(term262666, term262666.getClass(), "charaSlot", term262731);
        setField(term262666, term262666.getClass(), "charaLockSlot", term262735);
        setLongField(term262666, term262666.getClass(), "contentBit", 339306863841941365L);
        setIntField(term262666, term262666.getClass(), "playCount", 1648183622);
        setField(term262666, term262666.getClass(), "eventWatchedDate", "kEOZgldknG");
        setField(term262666, term262666.getClass(), "lastGameId", "TgjFBWvVUx");
        setField(term262666, term262666.getClass(), "lastRomVersion", "qyZMBaqUiw");
        setField(term262666, term262666.getClass(), "lastDataVersion", "LScHUVQpVE");
        setField(term262666, term262666.getClass(), "lastLoginDate", "FbQsgUOoDY");
        setField(term262666, term262666.getClass(), "lastPlayDate", "xUMqyqCvcb");
        setIntField(term262666, term262666.getClass(), "lastPlayCredit", -1008570265);
        setIntField(term262666, term262666.getClass(), "lastPlayMode", -1462411830);
        setIntField(term262666, term262666.getClass(), "lastPlaceId", 186052697);
        setField(term262666, term262666.getClass(), "lastPlaceName", "UQNPJMVgtC");
        setIntField(term262666, term262666.getClass(), "lastAllNetId", 554356747);
        setIntField(term262666, term262666.getClass(), "lastRegionId", -1090542678);
        setField(term262666, term262666.getClass(), "lastRegionName", "YxqBgErhNo");
        setField(term262666, term262666.getClass(), "lastClientId", "WquZFpGWYY");
        setField(term262666, term262666.getClass(), "lastCountryCode", "DVdLunspbQ");
        setIntField(term262666, term262666.getClass(), "lastSelectEMoney", 174422614);
        setIntField(term262666, term262666.getClass(), "lastSelectTicket", 433230186);
        setIntField(term262666, term262666.getClass(), "lastSelectCourse", -1345691314);
        setIntField(term262666, term262666.getClass(), "lastCountCourse", 705683968);
        setField(term262666, term262666.getClass(), "firstGameId", "OUQVWAHprD");
        setField(term262666, term262666.getClass(), "firstRomVersion", "ptFvDczffY");
        setField(term262666, term262666.getClass(), "firstDataVersion", "yDXeFOuvlq");
        setField(term262666, term262666.getClass(), "firstPlayDate", "gvnDtiMlxS");
        setField(term262666, term262666.getClass(), "compatibleCmVersion", "UQbUgGUwXM");
        setField(term262666, term262666.getClass(), "dailyBonusDate", "IsNPwCcyyl");
        setField(term262666, term262666.getClass(), "dailyCourseBonusDate", "zoWVYvefpE");
        setField(term262666, term262666.getClass(), "lastPairLoginDate", "qxWXWoDENr");
        setField(term262666, term262666.getClass(), "lastTrialPlayDate", "mEuPBmaYON");
        setIntField(term262666, term262666.getClass(), "playVsCount", -1433294930);
        setIntField(term262666, term262666.getClass(), "playSyncCount", -208376998);
        setIntField(term262666, term262666.getClass(), "winCount", -1110875685);
        setIntField(term262666, term262666.getClass(), "helpCount", 1354426438);
        setIntField(term262666, term262666.getClass(), "comboCount", 2029894030);
        setLongField(term262666, term262666.getClass(), "totalDeluxscore", -5577895591543822310L);
        setLongField(term262666, term262666.getClass(), "totalBasicDeluxscore", 171403039811059156L);
        setLongField(term262666, term262666.getClass(), "totalAdvancedDeluxscore", -81596236701261118L);
        setLongField(term262666, term262666.getClass(), "totalExpertDeluxscore", 8760037440437083734L);
        setLongField(term262666, term262666.getClass(), "totalMasterDeluxscore", 1159118933913430921L);
        setLongField(term262666, term262666.getClass(), "totalReMasterDeluxscore", -6771577708163180279L);
        setIntField(term262666, term262666.getClass(), "totalSync", 17901373);
        setIntField(term262666, term262666.getClass(), "totalBasicSync", -919565215);
        setIntField(term262666, term262666.getClass(), "totalAdvancedSync", 1095256626);
        setIntField(term262666, term262666.getClass(), "totalExpertSync", 410424321);
        setIntField(term262666, term262666.getClass(), "totalMasterSync", 1038671901);
        setIntField(term262666, term262666.getClass(), "totalReMasterSync", 540755284);
        setLongField(term262666, term262666.getClass(), "totalAchievement", 8527894285348400597L);
        setLongField(term262666, term262666.getClass(), "totalBasicAchievement", 6053927648101054187L);
        setLongField(term262666, term262666.getClass(), "totalAdvancedAchievement", 5054095712343348969L);
        setLongField(term262666, term262666.getClass(), "totalExpertAchievement", 8633384495506562772L);
        setLongField(term262666, term262666.getClass(), "totalMasterAchievement", -2214174245165666457L);
        setLongField(term262666, term262666.getClass(), "totalReMasterAchievement", -2851380277240351598L);
        setLongField(term262666, term262666.getClass(), "playerOldRating", 4875247293969008917L);
        setLongField(term262666, term262666.getClass(), "playerNewRating", 5389602279897548373L);
        setIntField(term262666, term262666.getClass(), "banState", 347931231);
        setLongField(term262666, term262666.getClass(), "dateTime", 1938648836994434275L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ObPGyohonw";
        callMethod(klass, "setFirstGameId", argTypes, term262666, args);
    }

};


