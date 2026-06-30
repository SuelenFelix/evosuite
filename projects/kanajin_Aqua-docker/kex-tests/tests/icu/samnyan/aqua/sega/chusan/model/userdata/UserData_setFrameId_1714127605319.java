package icu.samnyan.aqua.sega.chusan.model.userdata;

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
import static icu.samnyan.aqua.sega.chusan.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class UserData_setFrameId_1714127605319 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term286157;
     Object term286234;

    public UserData_setFrameId_1714127605319() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term286157 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term286157, term286157.getClass(), "id", 0L);
        setField(term286157, term286157.getClass(), "card", null);
        setField(term286157, term286157.getClass(), "userName", null);
        setIntField(term286157, term286157.getClass(), "level", 0);
        setIntField(term286157, term286157.getClass(), "reincarnationNum", 0);
        setField(term286157, term286157.getClass(), "exp", null);
        setLongField(term286157, term286157.getClass(), "point", 0L);
        setLongField(term286157, term286157.getClass(), "totalPoint", 0L);
        setIntField(term286157, term286157.getClass(), "playCount", 0);
        setIntField(term286157, term286157.getClass(), "multiPlayCount", 0);
        setIntField(term286157, term286157.getClass(), "playerRating", 0);
        setIntField(term286157, term286157.getClass(), "highestRating", 0);
        setIntField(term286157, term286157.getClass(), "nameplateId", 0);
        setIntField(term286157, term286157.getClass(), "frameId", 0);
        setIntField(term286157, term286157.getClass(), "characterId", 0);
        setIntField(term286157, term286157.getClass(), "trophyId", 0);
        setIntField(term286157, term286157.getClass(), "playedTutorialBit", 0);
        setIntField(term286157, term286157.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term286157, term286157.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term286157, term286157.getClass(), "totalMapNum", 0);
        setLongField(term286157, term286157.getClass(), "totalHiScore", 0L);
        setLongField(term286157, term286157.getClass(), "totalBasicHighScore", 0L);
        setLongField(term286157, term286157.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term286157, term286157.getClass(), "totalExpertHighScore", 0L);
        setLongField(term286157, term286157.getClass(), "totalMasterHighScore", 0L);
        setLongField(term286157, term286157.getClass(), "totalUltimaHighScore", 0L);
        setField(term286157, term286157.getClass(), "eventWatchedDate", null);
        setIntField(term286157, term286157.getClass(), "friendCount", 0);
        setField(term286157, term286157.getClass(), "firstGameId", null);
        setField(term286157, term286157.getClass(), "firstRomVersion", null);
        setField(term286157, term286157.getClass(), "firstDataVersion", null);
        setField(term286157, term286157.getClass(), "firstPlayDate", null);
        setField(term286157, term286157.getClass(), "lastGameId", null);
        setField(term286157, term286157.getClass(), "lastRomVersion", null);
        setField(term286157, term286157.getClass(), "lastDataVersion", null);
        setField(term286157, term286157.getClass(), "lastLoginDate", null);
        setField(term286157, term286157.getClass(), "lastPlayDate", null);
        setIntField(term286157, term286157.getClass(), "lastPlaceId", 0);
        setField(term286157, term286157.getClass(), "lastPlaceName", null);
        setField(term286157, term286157.getClass(), "lastRegionId", null);
        setField(term286157, term286157.getClass(), "lastRegionName", null);
        setField(term286157, term286157.getClass(), "lastAllNetId", null);
        setField(term286157, term286157.getClass(), "lastClientId", null);
        setField(term286157, term286157.getClass(), "lastCountryCode", null);
        setField(term286157, term286157.getClass(), "userNameEx", null);
        setField(term286157, term286157.getClass(), "compatibleCmVersion", null);
        setIntField(term286157, term286157.getClass(), "medal", 0);
        setIntField(term286157, term286157.getClass(), "mapIconId", 0);
        setIntField(term286157, term286157.getClass(), "voiceId", 0);
        setIntField(term286157, term286157.getClass(), "avatarWear", 0);
        setIntField(term286157, term286157.getClass(), "avatarHead", 0);
        setIntField(term286157, term286157.getClass(), "avatarFace", 0);
        setIntField(term286157, term286157.getClass(), "avatarSkin", 0);
        setIntField(term286157, term286157.getClass(), "avatarItem", 0);
        setIntField(term286157, term286157.getClass(), "avatarFront", 0);
        setIntField(term286157, term286157.getClass(), "avatarBack", 0);
        setIntField(term286157, term286157.getClass(), "classEmblemBase", 0);
        setIntField(term286157, term286157.getClass(), "classEmblemMedal", 0);
        setIntField(term286157, term286157.getClass(), "stockedGridCount", 0);
        setIntField(term286157, term286157.getClass(), "exMapLoopCount", 0);
        setIntField(term286157, term286157.getClass(), "netBattlePlayCount", 0);
        setIntField(term286157, term286157.getClass(), "netBattleWinCount", 0);
        setIntField(term286157, term286157.getClass(), "netBattleLoseCount", 0);
        setIntField(term286157, term286157.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term286157, term286157.getClass(), "charaIllustId", 0);
        setIntField(term286157, term286157.getClass(), "skillId", 0);
        setIntField(term286157, term286157.getClass(), "overPowerPoint", 0);
        setIntField(term286157, term286157.getClass(), "overPowerRate", 0);
        setIntField(term286157, term286157.getClass(), "overPowerLowerRank", 0);
        setIntField(term286157, term286157.getClass(), "avatarPoint", 0);
        setIntField(term286157, term286157.getClass(), "battleRankId", 0);
        setIntField(term286157, term286157.getClass(), "battleRankPoint", 0);
        setIntField(term286157, term286157.getClass(), "eliteRankPoint", 0);
        setIntField(term286157, term286157.getClass(), "netBattle1stCount", 0);
        setIntField(term286157, term286157.getClass(), "netBattle2ndCount", 0);
        setIntField(term286157, term286157.getClass(), "netBattle3rdCount", 0);
        setIntField(term286157, term286157.getClass(), "netBattle4thCount", 0);
        setIntField(term286157, term286157.getClass(), "netBattleCorrection", 0);
        setIntField(term286157, term286157.getClass(), "netBattleErrCnt", 0);
        setIntField(term286157, term286157.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term286157, term286157.getClass(), "battleRewardStatus", 0);
        setIntField(term286157, term286157.getClass(), "battleRewardIndex", 0);
        setIntField(term286157, term286157.getClass(), "battleRewardCount", 0);
        setIntField(term286157, term286157.getClass(), "ext1", 0);
        setIntField(term286157, term286157.getClass(), "ext2", 0);
        setIntField(term286157, term286157.getClass(), "ext3", 0);
        setIntField(term286157, term286157.getClass(), "ext4", 0);
        setIntField(term286157, term286157.getClass(), "ext5", 0);
        setIntField(term286157, term286157.getClass(), "ext6", 0);
        setIntField(term286157, term286157.getClass(), "ext7", 0);
        setIntField(term286157, term286157.getClass(), "ext8", 0);
        setIntField(term286157, term286157.getClass(), "ext9", 0);
        setIntField(term286157, term286157.getClass(), "ext10", 0);
        setField(term286157, term286157.getClass(), "extStr1", null);
        setField(term286157, term286157.getClass(), "extStr2", null);
        setLongField(term286157, term286157.getClass(), "extLong1", 0L);
        setLongField(term286157, term286157.getClass(), "extLong2", 0L);
        setField(term286157, term286157.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term286157, term286157.getClass(), "isNetBattleHost", false);
        setIntField(term286157, term286157.getClass(), "netBattleEndState", 0);
        term286234 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term286234;
        callMethod(klass, "setFrameId", argTypes, term286157, args);
    }

};


