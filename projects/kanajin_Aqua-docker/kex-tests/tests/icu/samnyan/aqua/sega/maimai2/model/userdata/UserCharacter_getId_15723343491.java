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

public class UserCharacter_getId_15723343491 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term185142;

    public UserCharacter_getId_15723343491() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term185148 = new Long(-7632759764262745126L);
        Integer term185211 = new Integer(551650321);
        ArrayList term185209 = new ArrayList();
        ((ArrayList) term185209).add(term185211);
        ArrayList term185215 = new ArrayList();
        term185142 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCharacter"));
        Object term185144 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term185146 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term185162 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term185163 = newInstance(Class.forName("java.time.LocalDate"));
        Object term185167 = newInstance(Class.forName("java.time.LocalTime"));
        Object term185172 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term185173 = newInstance(Class.forName("java.time.LocalDate"));
        Object term185177 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term185142, term185142.getClass(), "id", 5737078000461135622L);
        setLongField(term185144, term185144.getClass(), "id", -6039686681211056155L);
        setLongField(term185146, term185146.getClass(), "id", 1885391251428799555L);
        setField(term185146, term185146.getClass(), "extId", term185148);
        setField(term185146, term185146.getClass(), "luid", "ecpmlNmLqr");
        setIntField(term185163, term185163.getClass(), "year", 2023);
        setShortField(term185163, term185163.getClass(), "month", (short) 11);
        setShortField(term185163, term185163.getClass(), "day", (short) 25);
        setField(term185162, term185162.getClass(), "date", term185163);
        setByteField(term185167, term185167.getClass(), "hour", (byte) 1);
        setByteField(term185167, term185167.getClass(), "minute", (byte) 27);
        setByteField(term185167, term185167.getClass(), "second", (byte) 54);
        setIntField(term185167, term185167.getClass(), "nano", 382362839);
        setField(term185162, term185162.getClass(), "time", term185167);
        setField(term185146, term185146.getClass(), "registerTime", term185162);
        setIntField(term185173, term185173.getClass(), "year", 2019);
        setShortField(term185173, term185173.getClass(), "month", (short) 7);
        setShortField(term185173, term185173.getClass(), "day", (short) 3);
        setField(term185172, term185172.getClass(), "date", term185173);
        setByteField(term185177, term185177.getClass(), "hour", (byte) 1);
        setByteField(term185177, term185177.getClass(), "minute", (byte) 7);
        setByteField(term185177, term185177.getClass(), "second", (byte) 43);
        setIntField(term185177, term185177.getClass(), "nano", 632872277);
        setField(term185172, term185172.getClass(), "time", term185177);
        setField(term185146, term185146.getClass(), "accessTime", term185172);
        setField(term185144, term185144.getClass(), "card", term185146);
        setField(term185144, term185144.getClass(), "userName", "VCpvVubRIo");
        setIntField(term185144, term185144.getClass(), "isNetMember", -340513413);
        setIntField(term185144, term185144.getClass(), "iconId", -2054663329);
        setIntField(term185144, term185144.getClass(), "plateId", 448554489);
        setIntField(term185144, term185144.getClass(), "titleId", 1385351110);
        setIntField(term185144, term185144.getClass(), "partnerId", -1224101846);
        setIntField(term185144, term185144.getClass(), "frameId", 56346497);
        setIntField(term185144, term185144.getClass(), "selectMapId", -557292568);
        setIntField(term185144, term185144.getClass(), "totalAwake", -370318174);
        setIntField(term185144, term185144.getClass(), "gradeRating", 721583335);
        setIntField(term185144, term185144.getClass(), "musicRating", 1048340440);
        setIntField(term185144, term185144.getClass(), "playerRating", 1746284065);
        setIntField(term185144, term185144.getClass(), "highestRating", 1832660337);
        setIntField(term185144, term185144.getClass(), "gradeRank", -1990813786);
        setIntField(term185144, term185144.getClass(), "classRank", 1064455079);
        setIntField(term185144, term185144.getClass(), "courseRank", -1632870355);
        setField(term185144, term185144.getClass(), "charaSlot", term185209);
        setField(term185144, term185144.getClass(), "charaLockSlot", term185215);
        setLongField(term185144, term185144.getClass(), "contentBit", 1036262200586004233L);
        setIntField(term185144, term185144.getClass(), "playCount", 275827584);
        setField(term185144, term185144.getClass(), "eventWatchedDate", "ktYPRKLpUd");
        setField(term185144, term185144.getClass(), "lastGameId", "GduPctsAIe");
        setField(term185144, term185144.getClass(), "lastRomVersion", "yDJzJsbTrq");
        setField(term185144, term185144.getClass(), "lastDataVersion", "qvcWBAoFhO");
        setField(term185144, term185144.getClass(), "lastLoginDate", "oopBzHkVjN");
        setField(term185144, term185144.getClass(), "lastPlayDate", "RlgumahXAP");
        setIntField(term185144, term185144.getClass(), "lastPlayCredit", 1517327907);
        setIntField(term185144, term185144.getClass(), "lastPlayMode", -1581493553);
        setIntField(term185144, term185144.getClass(), "lastPlaceId", 1146701831);
        setField(term185144, term185144.getClass(), "lastPlaceName", "ZyrBdfnXeY");
        setIntField(term185144, term185144.getClass(), "lastAllNetId", -1098689257);
        setIntField(term185144, term185144.getClass(), "lastRegionId", -281818549);
        setField(term185144, term185144.getClass(), "lastRegionName", "bDxxtRkvDR");
        setField(term185144, term185144.getClass(), "lastClientId", "DXBdXbduQR");
        setField(term185144, term185144.getClass(), "lastCountryCode", "VDhtmUjQiN");
        setIntField(term185144, term185144.getClass(), "lastSelectEMoney", -1418327456);
        setIntField(term185144, term185144.getClass(), "lastSelectTicket", 572666147);
        setIntField(term185144, term185144.getClass(), "lastSelectCourse", 250271286);
        setIntField(term185144, term185144.getClass(), "lastCountCourse", 1309683419);
        setField(term185144, term185144.getClass(), "firstGameId", "WfovQKooYd");
        setField(term185144, term185144.getClass(), "firstRomVersion", "rGPyIinCpj");
        setField(term185144, term185144.getClass(), "firstDataVersion", "IaOmsLcrtn");
        setField(term185144, term185144.getClass(), "firstPlayDate", "ORKzUipLcn");
        setField(term185144, term185144.getClass(), "compatibleCmVersion", "BogHZveAYL");
        setField(term185144, term185144.getClass(), "dailyBonusDate", "burBurEYAD");
        setField(term185144, term185144.getClass(), "dailyCourseBonusDate", "EjzJWaQxzV");
        setField(term185144, term185144.getClass(), "lastPairLoginDate", "yKOwtIGejO");
        setField(term185144, term185144.getClass(), "lastTrialPlayDate", "eKWlJDvRzQ");
        setIntField(term185144, term185144.getClass(), "playVsCount", -2069969294);
        setIntField(term185144, term185144.getClass(), "playSyncCount", 439212977);
        setIntField(term185144, term185144.getClass(), "winCount", 2018062465);
        setIntField(term185144, term185144.getClass(), "helpCount", 1045822023);
        setIntField(term185144, term185144.getClass(), "comboCount", 1104676150);
        setLongField(term185144, term185144.getClass(), "totalDeluxscore", -8209613851123558072L);
        setLongField(term185144, term185144.getClass(), "totalBasicDeluxscore", -8531264660522466654L);
        setLongField(term185144, term185144.getClass(), "totalAdvancedDeluxscore", -822573573543723810L);
        setLongField(term185144, term185144.getClass(), "totalExpertDeluxscore", -6776297669899514549L);
        setLongField(term185144, term185144.getClass(), "totalMasterDeluxscore", -3190410552642755877L);
        setLongField(term185144, term185144.getClass(), "totalReMasterDeluxscore", -4625786793010778588L);
        setIntField(term185144, term185144.getClass(), "totalSync", 1984472098);
        setIntField(term185144, term185144.getClass(), "totalBasicSync", 1608550008);
        setIntField(term185144, term185144.getClass(), "totalAdvancedSync", 1198848988);
        setIntField(term185144, term185144.getClass(), "totalExpertSync", -1791070393);
        setIntField(term185144, term185144.getClass(), "totalMasterSync", 1342512875);
        setIntField(term185144, term185144.getClass(), "totalReMasterSync", 1276618218);
        setLongField(term185144, term185144.getClass(), "totalAchievement", -7808326957899833180L);
        setLongField(term185144, term185144.getClass(), "totalBasicAchievement", 7950277824110748410L);
        setLongField(term185144, term185144.getClass(), "totalAdvancedAchievement", 2614053727229115891L);
        setLongField(term185144, term185144.getClass(), "totalExpertAchievement", -9113146244420462428L);
        setLongField(term185144, term185144.getClass(), "totalMasterAchievement", -601952985266627110L);
        setLongField(term185144, term185144.getClass(), "totalReMasterAchievement", 4546898761125225903L);
        setLongField(term185144, term185144.getClass(), "playerOldRating", 2572918340045009928L);
        setLongField(term185144, term185144.getClass(), "playerNewRating", 6439867665349593917L);
        setIntField(term185144, term185144.getClass(), "banState", -437115096);
        setLongField(term185144, term185144.getClass(), "dateTime", 2080051965907831369L);
        setField(term185142, term185142.getClass(), "user", term185144);
        setIntField(term185142, term185142.getClass(), "characterId", 778176837);
        setIntField(term185142, term185142.getClass(), "level", 1986276488);
        setIntField(term185142, term185142.getClass(), "awakening", -1699338837);
        setIntField(term185142, term185142.getClass(), "useCount", -1616907879);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCharacter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term185142, args);
    }

};


