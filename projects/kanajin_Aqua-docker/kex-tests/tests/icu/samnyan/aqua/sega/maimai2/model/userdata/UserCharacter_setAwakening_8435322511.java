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

public class UserCharacter_setAwakening_8435322511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term191435;
     Object term191794;

    public UserCharacter_setAwakening_8435322511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term191441 = new Long(-9147545274054597570L);
        Integer term191504 = new Integer(-1855067606);
        Integer term191506 = new Integer(-433967657);
        Integer term191508 = new Integer(1411661019);
        ArrayList term191502 = new ArrayList();
        ((ArrayList) term191502).add(term191504);
        ((ArrayList) term191502).add(term191506);
        ((ArrayList) term191502).add(term191508);
        Integer term191514 = new Integer(1020857327);
        Integer term191516 = new Integer(587603547);
        Integer term191518 = new Integer(-1049371381);
        Integer term191520 = new Integer(-331201186);
        ArrayList term191512 = new ArrayList();
        ((ArrayList) term191512).add(term191514);
        ((ArrayList) term191512).add(term191516);
        ((ArrayList) term191512).add(term191518);
        ((ArrayList) term191512).add(term191520);
        term191435 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCharacter"));
        Object term191437 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term191439 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term191455 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term191456 = newInstance(Class.forName("java.time.LocalDate"));
        Object term191460 = newInstance(Class.forName("java.time.LocalTime"));
        Object term191465 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term191466 = newInstance(Class.forName("java.time.LocalDate"));
        Object term191470 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term191435, term191435.getClass(), "id", -8245205007746937712L);
        setLongField(term191437, term191437.getClass(), "id", 1527163968002418174L);
        setLongField(term191439, term191439.getClass(), "id", -1295904325279195649L);
        setField(term191439, term191439.getClass(), "extId", term191441);
        setField(term191439, term191439.getClass(), "luid", "NEEIZQiGuu");
        setIntField(term191456, term191456.getClass(), "year", 2022);
        setShortField(term191456, term191456.getClass(), "month", (short) 8);
        setShortField(term191456, term191456.getClass(), "day", (short) 26);
        setField(term191455, term191455.getClass(), "date", term191456);
        setByteField(term191460, term191460.getClass(), "hour", (byte) 20);
        setByteField(term191460, term191460.getClass(), "minute", (byte) 26);
        setByteField(term191460, term191460.getClass(), "second", (byte) 55);
        setIntField(term191460, term191460.getClass(), "nano", 380890210);
        setField(term191455, term191455.getClass(), "time", term191460);
        setField(term191439, term191439.getClass(), "registerTime", term191455);
        setIntField(term191466, term191466.getClass(), "year", 2010);
        setShortField(term191466, term191466.getClass(), "month", (short) 6);
        setShortField(term191466, term191466.getClass(), "day", (short) 21);
        setField(term191465, term191465.getClass(), "date", term191466);
        setByteField(term191470, term191470.getClass(), "hour", (byte) 4);
        setByteField(term191470, term191470.getClass(), "minute", (byte) 6);
        setByteField(term191470, term191470.getClass(), "second", (byte) 54);
        setIntField(term191470, term191470.getClass(), "nano", 837855935);
        setField(term191465, term191465.getClass(), "time", term191470);
        setField(term191439, term191439.getClass(), "accessTime", term191465);
        setField(term191437, term191437.getClass(), "card", term191439);
        setField(term191437, term191437.getClass(), "userName", "CEvOMXwQxg");
        setIntField(term191437, term191437.getClass(), "isNetMember", -1789461612);
        setIntField(term191437, term191437.getClass(), "iconId", 461243699);
        setIntField(term191437, term191437.getClass(), "plateId", 1738463601);
        setIntField(term191437, term191437.getClass(), "titleId", -1010128268);
        setIntField(term191437, term191437.getClass(), "partnerId", -2057175143);
        setIntField(term191437, term191437.getClass(), "frameId", 1430166837);
        setIntField(term191437, term191437.getClass(), "selectMapId", -1161108991);
        setIntField(term191437, term191437.getClass(), "totalAwake", -2024150009);
        setIntField(term191437, term191437.getClass(), "gradeRating", 1182356135);
        setIntField(term191437, term191437.getClass(), "musicRating", 313863614);
        setIntField(term191437, term191437.getClass(), "playerRating", -927688075);
        setIntField(term191437, term191437.getClass(), "highestRating", 1980560798);
        setIntField(term191437, term191437.getClass(), "gradeRank", 1048342124);
        setIntField(term191437, term191437.getClass(), "classRank", -535149999);
        setIntField(term191437, term191437.getClass(), "courseRank", 1350386277);
        setField(term191437, term191437.getClass(), "charaSlot", term191502);
        setField(term191437, term191437.getClass(), "charaLockSlot", term191512);
        setLongField(term191437, term191437.getClass(), "contentBit", 2593739595519795592L);
        setIntField(term191437, term191437.getClass(), "playCount", -1834376367);
        setField(term191437, term191437.getClass(), "eventWatchedDate", "mxdsPNszOh");
        setField(term191437, term191437.getClass(), "lastGameId", "IVVzjnfNdK");
        setField(term191437, term191437.getClass(), "lastRomVersion", "ATmDitYnqV");
        setField(term191437, term191437.getClass(), "lastDataVersion", "SZavUirhzV");
        setField(term191437, term191437.getClass(), "lastLoginDate", "aCaErGkYhA");
        setField(term191437, term191437.getClass(), "lastPlayDate", "twbXfBZPUC");
        setIntField(term191437, term191437.getClass(), "lastPlayCredit", -942813197);
        setIntField(term191437, term191437.getClass(), "lastPlayMode", 1374395557);
        setIntField(term191437, term191437.getClass(), "lastPlaceId", 1293688614);
        setField(term191437, term191437.getClass(), "lastPlaceName", "mYbjAQVgdp");
        setIntField(term191437, term191437.getClass(), "lastAllNetId", 151983912);
        setIntField(term191437, term191437.getClass(), "lastRegionId", -997603268);
        setField(term191437, term191437.getClass(), "lastRegionName", "bsHKGhUuqz");
        setField(term191437, term191437.getClass(), "lastClientId", "FxfgxciexL");
        setField(term191437, term191437.getClass(), "lastCountryCode", "dBKinpPYLb");
        setIntField(term191437, term191437.getClass(), "lastSelectEMoney", -1827144788);
        setIntField(term191437, term191437.getClass(), "lastSelectTicket", -1031810940);
        setIntField(term191437, term191437.getClass(), "lastSelectCourse", -1519353412);
        setIntField(term191437, term191437.getClass(), "lastCountCourse", 1644249608);
        setField(term191437, term191437.getClass(), "firstGameId", "BsnkZbwWZk");
        setField(term191437, term191437.getClass(), "firstRomVersion", "tQDCijzzgW");
        setField(term191437, term191437.getClass(), "firstDataVersion", "MeqXPTruBL");
        setField(term191437, term191437.getClass(), "firstPlayDate", "jjqkfZqAuK");
        setField(term191437, term191437.getClass(), "compatibleCmVersion", "oBCrGVIYdD");
        setField(term191437, term191437.getClass(), "dailyBonusDate", "wuSSpQZPZU");
        setField(term191437, term191437.getClass(), "dailyCourseBonusDate", "eaArOXcEdx");
        setField(term191437, term191437.getClass(), "lastPairLoginDate", "ynSIbcCBaI");
        setField(term191437, term191437.getClass(), "lastTrialPlayDate", "LaaQtlDqEd");
        setIntField(term191437, term191437.getClass(), "playVsCount", 628215504);
        setIntField(term191437, term191437.getClass(), "playSyncCount", -165430098);
        setIntField(term191437, term191437.getClass(), "winCount", 1205948703);
        setIntField(term191437, term191437.getClass(), "helpCount", 800755955);
        setIntField(term191437, term191437.getClass(), "comboCount", -1518118529);
        setLongField(term191437, term191437.getClass(), "totalDeluxscore", -8080309515657845927L);
        setLongField(term191437, term191437.getClass(), "totalBasicDeluxscore", -2970858677561070814L);
        setLongField(term191437, term191437.getClass(), "totalAdvancedDeluxscore", 1629913363654370546L);
        setLongField(term191437, term191437.getClass(), "totalExpertDeluxscore", -7475670834842534934L);
        setLongField(term191437, term191437.getClass(), "totalMasterDeluxscore", -5992307503492495034L);
        setLongField(term191437, term191437.getClass(), "totalReMasterDeluxscore", -8627807026781394638L);
        setIntField(term191437, term191437.getClass(), "totalSync", -1644443791);
        setIntField(term191437, term191437.getClass(), "totalBasicSync", -1589974536);
        setIntField(term191437, term191437.getClass(), "totalAdvancedSync", -691561016);
        setIntField(term191437, term191437.getClass(), "totalExpertSync", -75298071);
        setIntField(term191437, term191437.getClass(), "totalMasterSync", 537381033);
        setIntField(term191437, term191437.getClass(), "totalReMasterSync", -1941811470);
        setLongField(term191437, term191437.getClass(), "totalAchievement", -8237795903098574568L);
        setLongField(term191437, term191437.getClass(), "totalBasicAchievement", 4442762297096294204L);
        setLongField(term191437, term191437.getClass(), "totalAdvancedAchievement", 6038479498425106910L);
        setLongField(term191437, term191437.getClass(), "totalExpertAchievement", -1430997230026136507L);
        setLongField(term191437, term191437.getClass(), "totalMasterAchievement", -7698255142334748068L);
        setLongField(term191437, term191437.getClass(), "totalReMasterAchievement", -3113967336998881340L);
        setLongField(term191437, term191437.getClass(), "playerOldRating", -6726339959134278258L);
        setLongField(term191437, term191437.getClass(), "playerNewRating", -3539068786560687629L);
        setIntField(term191437, term191437.getClass(), "banState", -345897968);
        setLongField(term191437, term191437.getClass(), "dateTime", -4948801887280762934L);
        setField(term191435, term191435.getClass(), "user", term191437);
        setIntField(term191435, term191435.getClass(), "characterId", 2043612680);
        setIntField(term191435, term191435.getClass(), "level", -872188429);
        setIntField(term191435, term191435.getClass(), "awakening", 863394391);
        setIntField(term191435, term191435.getClass(), "useCount", -1464666900);
        term191794 = new Integer(1514362336);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCharacter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term191794;
        callMethod(klass, "setAwakening", argTypes, term191435, args);
    }

};


