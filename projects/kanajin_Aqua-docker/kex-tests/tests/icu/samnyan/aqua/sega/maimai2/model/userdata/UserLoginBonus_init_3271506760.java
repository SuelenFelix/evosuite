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

public class UserLoginBonus_init_3271506760 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43910;

    public UserLoginBonus_init_3271506760() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term43914 = new Long(463622836963501975L);
        Integer term43977 = new Integer(1862191391);
        Integer term43979 = new Integer(1131398807);
        ArrayList term43975 = new ArrayList();
        ((ArrayList) term43975).add(term43977);
        ((ArrayList) term43975).add(term43979);
        ArrayList term43983 = new ArrayList();
        term43910 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term43912 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term43928 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term43929 = newInstance(Class.forName("java.time.LocalDate"));
        Object term43933 = newInstance(Class.forName("java.time.LocalTime"));
        Object term43938 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term43939 = newInstance(Class.forName("java.time.LocalDate"));
        Object term43943 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term43910, term43910.getClass(), "id", -2448708288718122671L);
        setLongField(term43912, term43912.getClass(), "id", 7391856662550454315L);
        setField(term43912, term43912.getClass(), "extId", term43914);
        setField(term43912, term43912.getClass(), "luid", "aEZAnHuGSR");
        setIntField(term43929, term43929.getClass(), "year", 2020);
        setShortField(term43929, term43929.getClass(), "month", (short) 10);
        setShortField(term43929, term43929.getClass(), "day", (short) 8);
        setField(term43928, term43928.getClass(), "date", term43929);
        setByteField(term43933, term43933.getClass(), "hour", (byte) 15);
        setByteField(term43933, term43933.getClass(), "minute", (byte) 57);
        setByteField(term43933, term43933.getClass(), "second", (byte) 17);
        setIntField(term43933, term43933.getClass(), "nano", 288139529);
        setField(term43928, term43928.getClass(), "time", term43933);
        setField(term43912, term43912.getClass(), "registerTime", term43928);
        setIntField(term43939, term43939.getClass(), "year", 2022);
        setShortField(term43939, term43939.getClass(), "month", (short) 6);
        setShortField(term43939, term43939.getClass(), "day", (short) 12);
        setField(term43938, term43938.getClass(), "date", term43939);
        setByteField(term43943, term43943.getClass(), "hour", (byte) 14);
        setByteField(term43943, term43943.getClass(), "minute", (byte) 3);
        setByteField(term43943, term43943.getClass(), "second", (byte) 7);
        setIntField(term43943, term43943.getClass(), "nano", 637592645);
        setField(term43938, term43938.getClass(), "time", term43943);
        setField(term43912, term43912.getClass(), "accessTime", term43938);
        setField(term43910, term43910.getClass(), "card", term43912);
        setField(term43910, term43910.getClass(), "userName", "uMzGGnJFYF");
        setIntField(term43910, term43910.getClass(), "isNetMember", -875956888);
        setIntField(term43910, term43910.getClass(), "iconId", 65647821);
        setIntField(term43910, term43910.getClass(), "plateId", -1289614562);
        setIntField(term43910, term43910.getClass(), "titleId", 201090501);
        setIntField(term43910, term43910.getClass(), "partnerId", -1397182025);
        setIntField(term43910, term43910.getClass(), "frameId", -899619534);
        setIntField(term43910, term43910.getClass(), "selectMapId", 1638508595);
        setIntField(term43910, term43910.getClass(), "totalAwake", -114151747);
        setIntField(term43910, term43910.getClass(), "gradeRating", -2025145756);
        setIntField(term43910, term43910.getClass(), "musicRating", -1865692813);
        setIntField(term43910, term43910.getClass(), "playerRating", 1996398924);
        setIntField(term43910, term43910.getClass(), "highestRating", -400305198);
        setIntField(term43910, term43910.getClass(), "gradeRank", 1551023146);
        setIntField(term43910, term43910.getClass(), "classRank", 545151275);
        setIntField(term43910, term43910.getClass(), "courseRank", -125397975);
        setField(term43910, term43910.getClass(), "charaSlot", term43975);
        setField(term43910, term43910.getClass(), "charaLockSlot", term43983);
        setLongField(term43910, term43910.getClass(), "contentBit", -6573442531269156325L);
        setIntField(term43910, term43910.getClass(), "playCount", -595763151);
        setField(term43910, term43910.getClass(), "eventWatchedDate", "iAIRLRjFkP");
        setField(term43910, term43910.getClass(), "lastGameId", "cdXvvxXVTz");
        setField(term43910, term43910.getClass(), "lastRomVersion", "tXsfWIqIPn");
        setField(term43910, term43910.getClass(), "lastDataVersion", "tDmfqEyHaN");
        setField(term43910, term43910.getClass(), "lastLoginDate", "mTSMXFkWRr");
        setField(term43910, term43910.getClass(), "lastPlayDate", "qdIiMKwfzT");
        setIntField(term43910, term43910.getClass(), "lastPlayCredit", -1927187775);
        setIntField(term43910, term43910.getClass(), "lastPlayMode", -246129741);
        setIntField(term43910, term43910.getClass(), "lastPlaceId", -1681312941);
        setField(term43910, term43910.getClass(), "lastPlaceName", "qrmUWIxufo");
        setIntField(term43910, term43910.getClass(), "lastAllNetId", -2026593848);
        setIntField(term43910, term43910.getClass(), "lastRegionId", -1523977596);
        setField(term43910, term43910.getClass(), "lastRegionName", "SeWCUkXfZv");
        setField(term43910, term43910.getClass(), "lastClientId", "woQcQRYwNH");
        setField(term43910, term43910.getClass(), "lastCountryCode", "uQjzusifTg");
        setIntField(term43910, term43910.getClass(), "lastSelectEMoney", -1036117253);
        setIntField(term43910, term43910.getClass(), "lastSelectTicket", -697114016);
        setIntField(term43910, term43910.getClass(), "lastSelectCourse", 1991952957);
        setIntField(term43910, term43910.getClass(), "lastCountCourse", 1877895251);
        setField(term43910, term43910.getClass(), "firstGameId", "mOulGkUjOk");
        setField(term43910, term43910.getClass(), "firstRomVersion", "hNWRuNEgOf");
        setField(term43910, term43910.getClass(), "firstDataVersion", "CEtjGBplmv");
        setField(term43910, term43910.getClass(), "firstPlayDate", "XosDTAzIAT");
        setField(term43910, term43910.getClass(), "compatibleCmVersion", "lcCEhCpiZM");
        setField(term43910, term43910.getClass(), "dailyBonusDate", "OPJlqMJxdq");
        setField(term43910, term43910.getClass(), "dailyCourseBonusDate", "COhzwXcfds");
        setField(term43910, term43910.getClass(), "lastPairLoginDate", "anncJTnzrg");
        setField(term43910, term43910.getClass(), "lastTrialPlayDate", "GMylOocLnB");
        setIntField(term43910, term43910.getClass(), "playVsCount", 962916253);
        setIntField(term43910, term43910.getClass(), "playSyncCount", 1580094069);
        setIntField(term43910, term43910.getClass(), "winCount", -890066143);
        setIntField(term43910, term43910.getClass(), "helpCount", 1782477754);
        setIntField(term43910, term43910.getClass(), "comboCount", 1979972143);
        setLongField(term43910, term43910.getClass(), "totalDeluxscore", -2326118746160954215L);
        setLongField(term43910, term43910.getClass(), "totalBasicDeluxscore", 6091220404570069089L);
        setLongField(term43910, term43910.getClass(), "totalAdvancedDeluxscore", 8116689826697820264L);
        setLongField(term43910, term43910.getClass(), "totalExpertDeluxscore", 6594952836231202437L);
        setLongField(term43910, term43910.getClass(), "totalMasterDeluxscore", -6888944543104457634L);
        setLongField(term43910, term43910.getClass(), "totalReMasterDeluxscore", 3965773362038690712L);
        setIntField(term43910, term43910.getClass(), "totalSync", -1445141749);
        setIntField(term43910, term43910.getClass(), "totalBasicSync", 231866725);
        setIntField(term43910, term43910.getClass(), "totalAdvancedSync", 264142674);
        setIntField(term43910, term43910.getClass(), "totalExpertSync", 318938584);
        setIntField(term43910, term43910.getClass(), "totalMasterSync", 804113142);
        setIntField(term43910, term43910.getClass(), "totalReMasterSync", 1426555916);
        setLongField(term43910, term43910.getClass(), "totalAchievement", 7329701902499669605L);
        setLongField(term43910, term43910.getClass(), "totalBasicAchievement", 596630330404532696L);
        setLongField(term43910, term43910.getClass(), "totalAdvancedAchievement", 3628778546975266226L);
        setLongField(term43910, term43910.getClass(), "totalExpertAchievement", 5655884987926296954L);
        setLongField(term43910, term43910.getClass(), "totalMasterAchievement", -6055416231811865303L);
        setLongField(term43910, term43910.getClass(), "totalReMasterAchievement", 4600612212546071466L);
        setLongField(term43910, term43910.getClass(), "playerOldRating", 736282298030442495L);
        setLongField(term43910, term43910.getClass(), "playerNewRating", -8385042448755891761L);
        setIntField(term43910, term43910.getClass(), "banState", 96582503);
        setLongField(term43910, term43910.getClass(), "dateTime", 3776640840397782177L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserLoginBonus");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Object[] args = new Object[1];
        args[0] = term43910;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


