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

public class UserDetail_setHelpCount_400240618130 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4303771;
     Object term4304130;

    public UserDetail_setHelpCount_400240618130() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4303775 = new Long(3829060389754535308L);
        Integer term4303838 = new Integer(-29727064);
        Integer term4303840 = new Integer(-36303217);
        Integer term4303842 = new Integer(-1425546184);
        Integer term4303844 = new Integer(-1133905901);
        ArrayList term4303836 = new ArrayList();
        ((ArrayList) term4303836).add(term4303838);
        ((ArrayList) term4303836).add(term4303840);
        ((ArrayList) term4303836).add(term4303842);
        ((ArrayList) term4303836).add(term4303844);
        Integer term4303850 = new Integer(-975779438);
        Integer term4303852 = new Integer(-1141325147);
        Integer term4303854 = new Integer(1102382810);
        Integer term4303856 = new Integer(-546054340);
        Integer term4303858 = new Integer(839496076);
        Integer term4303860 = new Integer(-709438438);
        ArrayList term4303848 = new ArrayList();
        ((ArrayList) term4303848).add(term4303850);
        ((ArrayList) term4303848).add(term4303852);
        ((ArrayList) term4303848).add(term4303854);
        ((ArrayList) term4303848).add(term4303856);
        ((ArrayList) term4303848).add(term4303858);
        ((ArrayList) term4303848).add(term4303860);
        term4303771 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4303773 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4303789 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4303790 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4303794 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4303799 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4303800 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4303804 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4303771, term4303771.getClass(), "id", -484507781061881249L);
        setLongField(term4303773, term4303773.getClass(), "id", 5083743012783305688L);
        setField(term4303773, term4303773.getClass(), "extId", term4303775);
        setField(term4303773, term4303773.getClass(), "luid", "ZkNCeyRObt");
        setIntField(term4303790, term4303790.getClass(), "year", 2023);
        setShortField(term4303790, term4303790.getClass(), "month", (short) 11);
        setShortField(term4303790, term4303790.getClass(), "day", (short) 23);
        setField(term4303789, term4303789.getClass(), "date", term4303790);
        setByteField(term4303794, term4303794.getClass(), "hour", (byte) 19);
        setByteField(term4303794, term4303794.getClass(), "minute", (byte) 12);
        setByteField(term4303794, term4303794.getClass(), "second", (byte) 16);
        setIntField(term4303794, term4303794.getClass(), "nano", 257739817);
        setField(term4303789, term4303789.getClass(), "time", term4303794);
        setField(term4303773, term4303773.getClass(), "registerTime", term4303789);
        setIntField(term4303800, term4303800.getClass(), "year", 2026);
        setShortField(term4303800, term4303800.getClass(), "month", (short) 8);
        setShortField(term4303800, term4303800.getClass(), "day", (short) 26);
        setField(term4303799, term4303799.getClass(), "date", term4303800);
        setByteField(term4303804, term4303804.getClass(), "hour", (byte) 21);
        setByteField(term4303804, term4303804.getClass(), "minute", (byte) 43);
        setByteField(term4303804, term4303804.getClass(), "second", (byte) 51);
        setIntField(term4303804, term4303804.getClass(), "nano", 795399146);
        setField(term4303799, term4303799.getClass(), "time", term4303804);
        setField(term4303773, term4303773.getClass(), "accessTime", term4303799);
        setField(term4303771, term4303771.getClass(), "card", term4303773);
        setField(term4303771, term4303771.getClass(), "userName", "UiHuFTHVwt");
        setIntField(term4303771, term4303771.getClass(), "isNetMember", 285550698);
        setIntField(term4303771, term4303771.getClass(), "iconId", 535889377);
        setIntField(term4303771, term4303771.getClass(), "plateId", -1980937973);
        setIntField(term4303771, term4303771.getClass(), "titleId", -1550801030);
        setIntField(term4303771, term4303771.getClass(), "partnerId", -756846082);
        setIntField(term4303771, term4303771.getClass(), "frameId", -152947292);
        setIntField(term4303771, term4303771.getClass(), "selectMapId", -1603194863);
        setIntField(term4303771, term4303771.getClass(), "totalAwake", 271730562);
        setIntField(term4303771, term4303771.getClass(), "gradeRating", -1051643928);
        setIntField(term4303771, term4303771.getClass(), "musicRating", 385564781);
        setIntField(term4303771, term4303771.getClass(), "playerRating", -243516784);
        setIntField(term4303771, term4303771.getClass(), "highestRating", 1964388225);
        setIntField(term4303771, term4303771.getClass(), "gradeRank", -71953069);
        setIntField(term4303771, term4303771.getClass(), "classRank", -22187530);
        setIntField(term4303771, term4303771.getClass(), "courseRank", -506455260);
        setField(term4303771, term4303771.getClass(), "charaSlot", term4303836);
        setField(term4303771, term4303771.getClass(), "charaLockSlot", term4303848);
        setLongField(term4303771, term4303771.getClass(), "contentBit", -7080764408202568690L);
        setIntField(term4303771, term4303771.getClass(), "playCount", 455423865);
        setField(term4303771, term4303771.getClass(), "eventWatchedDate", "BNalQuioUp");
        setField(term4303771, term4303771.getClass(), "lastGameId", "LXcSmPBQcU");
        setField(term4303771, term4303771.getClass(), "lastRomVersion", "BTJqUzkUQG");
        setField(term4303771, term4303771.getClass(), "lastDataVersion", "jAQClQswjf");
        setField(term4303771, term4303771.getClass(), "lastLoginDate", "zNJJCDMRJR");
        setField(term4303771, term4303771.getClass(), "lastPlayDate", "VVIZDYIviY");
        setIntField(term4303771, term4303771.getClass(), "lastPlayCredit", 588510692);
        setIntField(term4303771, term4303771.getClass(), "lastPlayMode", 1251013294);
        setIntField(term4303771, term4303771.getClass(), "lastPlaceId", -1111324612);
        setField(term4303771, term4303771.getClass(), "lastPlaceName", "cXcXPkFQoM");
        setIntField(term4303771, term4303771.getClass(), "lastAllNetId", -99631758);
        setIntField(term4303771, term4303771.getClass(), "lastRegionId", -534745863);
        setField(term4303771, term4303771.getClass(), "lastRegionName", "gCozkEYrRl");
        setField(term4303771, term4303771.getClass(), "lastClientId", "jWFEEzvxTg");
        setField(term4303771, term4303771.getClass(), "lastCountryCode", "HnZpiFWXuY");
        setIntField(term4303771, term4303771.getClass(), "lastSelectEMoney", 88610728);
        setIntField(term4303771, term4303771.getClass(), "lastSelectTicket", 1137409786);
        setIntField(term4303771, term4303771.getClass(), "lastSelectCourse", -383190902);
        setIntField(term4303771, term4303771.getClass(), "lastCountCourse", -1413794508);
        setField(term4303771, term4303771.getClass(), "firstGameId", "tsjqvvpFOc");
        setField(term4303771, term4303771.getClass(), "firstRomVersion", "WjEdfKtsLR");
        setField(term4303771, term4303771.getClass(), "firstDataVersion", "FowxAAHUpz");
        setField(term4303771, term4303771.getClass(), "firstPlayDate", "iAGXBvSZDq");
        setField(term4303771, term4303771.getClass(), "compatibleCmVersion", "PBjrvXDuKl");
        setField(term4303771, term4303771.getClass(), "dailyBonusDate", "cEbJQXcPta");
        setField(term4303771, term4303771.getClass(), "dailyCourseBonusDate", "URvsxjapXp");
        setField(term4303771, term4303771.getClass(), "lastPairLoginDate", "qZMYQgoUmT");
        setField(term4303771, term4303771.getClass(), "lastTrialPlayDate", "QNiCfSQFHz");
        setIntField(term4303771, term4303771.getClass(), "playVsCount", 2050178517);
        setIntField(term4303771, term4303771.getClass(), "playSyncCount", 502943837);
        setIntField(term4303771, term4303771.getClass(), "winCount", -717493937);
        setIntField(term4303771, term4303771.getClass(), "helpCount", 1878258746);
        setIntField(term4303771, term4303771.getClass(), "comboCount", -894786443);
        setLongField(term4303771, term4303771.getClass(), "totalDeluxscore", 5447971799576307518L);
        setLongField(term4303771, term4303771.getClass(), "totalBasicDeluxscore", -5734125064206691130L);
        setLongField(term4303771, term4303771.getClass(), "totalAdvancedDeluxscore", -7202226967537589261L);
        setLongField(term4303771, term4303771.getClass(), "totalExpertDeluxscore", 417065915381910094L);
        setLongField(term4303771, term4303771.getClass(), "totalMasterDeluxscore", -132462184811674822L);
        setLongField(term4303771, term4303771.getClass(), "totalReMasterDeluxscore", 6247663723353538328L);
        setIntField(term4303771, term4303771.getClass(), "totalSync", 1623973026);
        setIntField(term4303771, term4303771.getClass(), "totalBasicSync", -1286702256);
        setIntField(term4303771, term4303771.getClass(), "totalAdvancedSync", -2118484297);
        setIntField(term4303771, term4303771.getClass(), "totalExpertSync", -958989622);
        setIntField(term4303771, term4303771.getClass(), "totalMasterSync", 681484518);
        setIntField(term4303771, term4303771.getClass(), "totalReMasterSync", -1703105551);
        setLongField(term4303771, term4303771.getClass(), "totalAchievement", 8683654001630120016L);
        setLongField(term4303771, term4303771.getClass(), "totalBasicAchievement", -7545889791950201109L);
        setLongField(term4303771, term4303771.getClass(), "totalAdvancedAchievement", -3233766941278609492L);
        setLongField(term4303771, term4303771.getClass(), "totalExpertAchievement", 8725935411405724098L);
        setLongField(term4303771, term4303771.getClass(), "totalMasterAchievement", -1503914385785057656L);
        setLongField(term4303771, term4303771.getClass(), "totalReMasterAchievement", 5880998679012886772L);
        setLongField(term4303771, term4303771.getClass(), "playerOldRating", 929688240223508128L);
        setLongField(term4303771, term4303771.getClass(), "playerNewRating", -5859422776011668844L);
        setIntField(term4303771, term4303771.getClass(), "banState", 729864357);
        setLongField(term4303771, term4303771.getClass(), "dateTime", 7899508035643789881L);
        term4304130 = new Integer(-1214737137);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4304130;
        callMethod(klass, "setHelpCount", argTypes, term4303771, args);
    }

};


