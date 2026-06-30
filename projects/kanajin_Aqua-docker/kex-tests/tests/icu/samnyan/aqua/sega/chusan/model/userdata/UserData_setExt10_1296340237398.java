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

public class UserData_setExt10_1296340237398 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term292362;
     Object term292439;

    public UserData_setExt10_1296340237398() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term292362 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term292362, term292362.getClass(), "id", 0L);
        setField(term292362, term292362.getClass(), "card", null);
        setField(term292362, term292362.getClass(), "userName", null);
        setIntField(term292362, term292362.getClass(), "level", 0);
        setIntField(term292362, term292362.getClass(), "reincarnationNum", 0);
        setField(term292362, term292362.getClass(), "exp", null);
        setLongField(term292362, term292362.getClass(), "point", 0L);
        setLongField(term292362, term292362.getClass(), "totalPoint", 0L);
        setIntField(term292362, term292362.getClass(), "playCount", 0);
        setIntField(term292362, term292362.getClass(), "multiPlayCount", 0);
        setIntField(term292362, term292362.getClass(), "playerRating", 0);
        setIntField(term292362, term292362.getClass(), "highestRating", 0);
        setIntField(term292362, term292362.getClass(), "nameplateId", 0);
        setIntField(term292362, term292362.getClass(), "frameId", 0);
        setIntField(term292362, term292362.getClass(), "characterId", 0);
        setIntField(term292362, term292362.getClass(), "trophyId", 0);
        setIntField(term292362, term292362.getClass(), "playedTutorialBit", 0);
        setIntField(term292362, term292362.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term292362, term292362.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term292362, term292362.getClass(), "totalMapNum", 0);
        setLongField(term292362, term292362.getClass(), "totalHiScore", 0L);
        setLongField(term292362, term292362.getClass(), "totalBasicHighScore", 0L);
        setLongField(term292362, term292362.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term292362, term292362.getClass(), "totalExpertHighScore", 0L);
        setLongField(term292362, term292362.getClass(), "totalMasterHighScore", 0L);
        setLongField(term292362, term292362.getClass(), "totalUltimaHighScore", 0L);
        setField(term292362, term292362.getClass(), "eventWatchedDate", null);
        setIntField(term292362, term292362.getClass(), "friendCount", 0);
        setField(term292362, term292362.getClass(), "firstGameId", null);
        setField(term292362, term292362.getClass(), "firstRomVersion", null);
        setField(term292362, term292362.getClass(), "firstDataVersion", null);
        setField(term292362, term292362.getClass(), "firstPlayDate", null);
        setField(term292362, term292362.getClass(), "lastGameId", null);
        setField(term292362, term292362.getClass(), "lastRomVersion", null);
        setField(term292362, term292362.getClass(), "lastDataVersion", null);
        setField(term292362, term292362.getClass(), "lastLoginDate", null);
        setField(term292362, term292362.getClass(), "lastPlayDate", null);
        setIntField(term292362, term292362.getClass(), "lastPlaceId", 0);
        setField(term292362, term292362.getClass(), "lastPlaceName", null);
        setField(term292362, term292362.getClass(), "lastRegionId", null);
        setField(term292362, term292362.getClass(), "lastRegionName", null);
        setField(term292362, term292362.getClass(), "lastAllNetId", null);
        setField(term292362, term292362.getClass(), "lastClientId", null);
        setField(term292362, term292362.getClass(), "lastCountryCode", null);
        setField(term292362, term292362.getClass(), "userNameEx", null);
        setField(term292362, term292362.getClass(), "compatibleCmVersion", null);
        setIntField(term292362, term292362.getClass(), "medal", 0);
        setIntField(term292362, term292362.getClass(), "mapIconId", 0);
        setIntField(term292362, term292362.getClass(), "voiceId", 0);
        setIntField(term292362, term292362.getClass(), "avatarWear", 0);
        setIntField(term292362, term292362.getClass(), "avatarHead", 0);
        setIntField(term292362, term292362.getClass(), "avatarFace", 0);
        setIntField(term292362, term292362.getClass(), "avatarSkin", 0);
        setIntField(term292362, term292362.getClass(), "avatarItem", 0);
        setIntField(term292362, term292362.getClass(), "avatarFront", 0);
        setIntField(term292362, term292362.getClass(), "avatarBack", 0);
        setIntField(term292362, term292362.getClass(), "classEmblemBase", 0);
        setIntField(term292362, term292362.getClass(), "classEmblemMedal", 0);
        setIntField(term292362, term292362.getClass(), "stockedGridCount", 0);
        setIntField(term292362, term292362.getClass(), "exMapLoopCount", 0);
        setIntField(term292362, term292362.getClass(), "netBattlePlayCount", 0);
        setIntField(term292362, term292362.getClass(), "netBattleWinCount", 0);
        setIntField(term292362, term292362.getClass(), "netBattleLoseCount", 0);
        setIntField(term292362, term292362.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term292362, term292362.getClass(), "charaIllustId", 0);
        setIntField(term292362, term292362.getClass(), "skillId", 0);
        setIntField(term292362, term292362.getClass(), "overPowerPoint", 0);
        setIntField(term292362, term292362.getClass(), "overPowerRate", 0);
        setIntField(term292362, term292362.getClass(), "overPowerLowerRank", 0);
        setIntField(term292362, term292362.getClass(), "avatarPoint", 0);
        setIntField(term292362, term292362.getClass(), "battleRankId", 0);
        setIntField(term292362, term292362.getClass(), "battleRankPoint", 0);
        setIntField(term292362, term292362.getClass(), "eliteRankPoint", 0);
        setIntField(term292362, term292362.getClass(), "netBattle1stCount", 0);
        setIntField(term292362, term292362.getClass(), "netBattle2ndCount", 0);
        setIntField(term292362, term292362.getClass(), "netBattle3rdCount", 0);
        setIntField(term292362, term292362.getClass(), "netBattle4thCount", 0);
        setIntField(term292362, term292362.getClass(), "netBattleCorrection", 0);
        setIntField(term292362, term292362.getClass(), "netBattleErrCnt", 0);
        setIntField(term292362, term292362.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term292362, term292362.getClass(), "battleRewardStatus", 0);
        setIntField(term292362, term292362.getClass(), "battleRewardIndex", 0);
        setIntField(term292362, term292362.getClass(), "battleRewardCount", 0);
        setIntField(term292362, term292362.getClass(), "ext1", 0);
        setIntField(term292362, term292362.getClass(), "ext2", 0);
        setIntField(term292362, term292362.getClass(), "ext3", 0);
        setIntField(term292362, term292362.getClass(), "ext4", 0);
        setIntField(term292362, term292362.getClass(), "ext5", 0);
        setIntField(term292362, term292362.getClass(), "ext6", 0);
        setIntField(term292362, term292362.getClass(), "ext7", 0);
        setIntField(term292362, term292362.getClass(), "ext8", 0);
        setIntField(term292362, term292362.getClass(), "ext9", 0);
        setIntField(term292362, term292362.getClass(), "ext10", 0);
        setField(term292362, term292362.getClass(), "extStr1", null);
        setField(term292362, term292362.getClass(), "extStr2", null);
        setLongField(term292362, term292362.getClass(), "extLong1", 0L);
        setLongField(term292362, term292362.getClass(), "extLong2", 0L);
        setField(term292362, term292362.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term292362, term292362.getClass(), "isNetBattleHost", false);
        setIntField(term292362, term292362.getClass(), "netBattleEndState", 0);
        term292439 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term292439;
        callMethod(klass, "setExt10", argTypes, term292362, args);
    }

};


