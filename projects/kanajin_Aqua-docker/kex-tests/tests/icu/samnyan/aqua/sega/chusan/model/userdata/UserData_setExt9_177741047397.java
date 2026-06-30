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

public class UserData_setExt9_177741047397 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term292283;
     Object term292360;

    public UserData_setExt9_177741047397() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term292283 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term292283, term292283.getClass(), "id", 0L);
        setField(term292283, term292283.getClass(), "card", null);
        setField(term292283, term292283.getClass(), "userName", null);
        setIntField(term292283, term292283.getClass(), "level", 0);
        setIntField(term292283, term292283.getClass(), "reincarnationNum", 0);
        setField(term292283, term292283.getClass(), "exp", null);
        setLongField(term292283, term292283.getClass(), "point", 0L);
        setLongField(term292283, term292283.getClass(), "totalPoint", 0L);
        setIntField(term292283, term292283.getClass(), "playCount", 0);
        setIntField(term292283, term292283.getClass(), "multiPlayCount", 0);
        setIntField(term292283, term292283.getClass(), "playerRating", 0);
        setIntField(term292283, term292283.getClass(), "highestRating", 0);
        setIntField(term292283, term292283.getClass(), "nameplateId", 0);
        setIntField(term292283, term292283.getClass(), "frameId", 0);
        setIntField(term292283, term292283.getClass(), "characterId", 0);
        setIntField(term292283, term292283.getClass(), "trophyId", 0);
        setIntField(term292283, term292283.getClass(), "playedTutorialBit", 0);
        setIntField(term292283, term292283.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term292283, term292283.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term292283, term292283.getClass(), "totalMapNum", 0);
        setLongField(term292283, term292283.getClass(), "totalHiScore", 0L);
        setLongField(term292283, term292283.getClass(), "totalBasicHighScore", 0L);
        setLongField(term292283, term292283.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term292283, term292283.getClass(), "totalExpertHighScore", 0L);
        setLongField(term292283, term292283.getClass(), "totalMasterHighScore", 0L);
        setLongField(term292283, term292283.getClass(), "totalUltimaHighScore", 0L);
        setField(term292283, term292283.getClass(), "eventWatchedDate", null);
        setIntField(term292283, term292283.getClass(), "friendCount", 0);
        setField(term292283, term292283.getClass(), "firstGameId", null);
        setField(term292283, term292283.getClass(), "firstRomVersion", null);
        setField(term292283, term292283.getClass(), "firstDataVersion", null);
        setField(term292283, term292283.getClass(), "firstPlayDate", null);
        setField(term292283, term292283.getClass(), "lastGameId", null);
        setField(term292283, term292283.getClass(), "lastRomVersion", null);
        setField(term292283, term292283.getClass(), "lastDataVersion", null);
        setField(term292283, term292283.getClass(), "lastLoginDate", null);
        setField(term292283, term292283.getClass(), "lastPlayDate", null);
        setIntField(term292283, term292283.getClass(), "lastPlaceId", 0);
        setField(term292283, term292283.getClass(), "lastPlaceName", null);
        setField(term292283, term292283.getClass(), "lastRegionId", null);
        setField(term292283, term292283.getClass(), "lastRegionName", null);
        setField(term292283, term292283.getClass(), "lastAllNetId", null);
        setField(term292283, term292283.getClass(), "lastClientId", null);
        setField(term292283, term292283.getClass(), "lastCountryCode", null);
        setField(term292283, term292283.getClass(), "userNameEx", null);
        setField(term292283, term292283.getClass(), "compatibleCmVersion", null);
        setIntField(term292283, term292283.getClass(), "medal", 0);
        setIntField(term292283, term292283.getClass(), "mapIconId", 0);
        setIntField(term292283, term292283.getClass(), "voiceId", 0);
        setIntField(term292283, term292283.getClass(), "avatarWear", 0);
        setIntField(term292283, term292283.getClass(), "avatarHead", 0);
        setIntField(term292283, term292283.getClass(), "avatarFace", 0);
        setIntField(term292283, term292283.getClass(), "avatarSkin", 0);
        setIntField(term292283, term292283.getClass(), "avatarItem", 0);
        setIntField(term292283, term292283.getClass(), "avatarFront", 0);
        setIntField(term292283, term292283.getClass(), "avatarBack", 0);
        setIntField(term292283, term292283.getClass(), "classEmblemBase", 0);
        setIntField(term292283, term292283.getClass(), "classEmblemMedal", 0);
        setIntField(term292283, term292283.getClass(), "stockedGridCount", 0);
        setIntField(term292283, term292283.getClass(), "exMapLoopCount", 0);
        setIntField(term292283, term292283.getClass(), "netBattlePlayCount", 0);
        setIntField(term292283, term292283.getClass(), "netBattleWinCount", 0);
        setIntField(term292283, term292283.getClass(), "netBattleLoseCount", 0);
        setIntField(term292283, term292283.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term292283, term292283.getClass(), "charaIllustId", 0);
        setIntField(term292283, term292283.getClass(), "skillId", 0);
        setIntField(term292283, term292283.getClass(), "overPowerPoint", 0);
        setIntField(term292283, term292283.getClass(), "overPowerRate", 0);
        setIntField(term292283, term292283.getClass(), "overPowerLowerRank", 0);
        setIntField(term292283, term292283.getClass(), "avatarPoint", 0);
        setIntField(term292283, term292283.getClass(), "battleRankId", 0);
        setIntField(term292283, term292283.getClass(), "battleRankPoint", 0);
        setIntField(term292283, term292283.getClass(), "eliteRankPoint", 0);
        setIntField(term292283, term292283.getClass(), "netBattle1stCount", 0);
        setIntField(term292283, term292283.getClass(), "netBattle2ndCount", 0);
        setIntField(term292283, term292283.getClass(), "netBattle3rdCount", 0);
        setIntField(term292283, term292283.getClass(), "netBattle4thCount", 0);
        setIntField(term292283, term292283.getClass(), "netBattleCorrection", 0);
        setIntField(term292283, term292283.getClass(), "netBattleErrCnt", 0);
        setIntField(term292283, term292283.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term292283, term292283.getClass(), "battleRewardStatus", 0);
        setIntField(term292283, term292283.getClass(), "battleRewardIndex", 0);
        setIntField(term292283, term292283.getClass(), "battleRewardCount", 0);
        setIntField(term292283, term292283.getClass(), "ext1", 0);
        setIntField(term292283, term292283.getClass(), "ext2", 0);
        setIntField(term292283, term292283.getClass(), "ext3", 0);
        setIntField(term292283, term292283.getClass(), "ext4", 0);
        setIntField(term292283, term292283.getClass(), "ext5", 0);
        setIntField(term292283, term292283.getClass(), "ext6", 0);
        setIntField(term292283, term292283.getClass(), "ext7", 0);
        setIntField(term292283, term292283.getClass(), "ext8", 0);
        setIntField(term292283, term292283.getClass(), "ext9", 0);
        setIntField(term292283, term292283.getClass(), "ext10", 0);
        setField(term292283, term292283.getClass(), "extStr1", null);
        setField(term292283, term292283.getClass(), "extStr2", null);
        setLongField(term292283, term292283.getClass(), "extLong1", 0L);
        setLongField(term292283, term292283.getClass(), "extLong2", 0L);
        setField(term292283, term292283.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term292283, term292283.getClass(), "isNetBattleHost", false);
        setIntField(term292283, term292283.getClass(), "netBattleEndState", 0);
        term292360 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term292360;
        callMethod(klass, "setExt9", argTypes, term292283, args);
    }

};


