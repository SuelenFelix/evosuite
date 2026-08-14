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

public class UserData_getPlayerRating_398868525217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4212807;

    public UserData_getPlayerRating_398868525217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4212807 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term4212807, term4212807.getClass(), "id", 0L);
        setField(term4212807, term4212807.getClass(), "card", null);
        setField(term4212807, term4212807.getClass(), "userName", null);
        setIntField(term4212807, term4212807.getClass(), "level", 0);
        setIntField(term4212807, term4212807.getClass(), "reincarnationNum", 0);
        setField(term4212807, term4212807.getClass(), "exp", null);
        setLongField(term4212807, term4212807.getClass(), "point", 0L);
        setLongField(term4212807, term4212807.getClass(), "totalPoint", 0L);
        setIntField(term4212807, term4212807.getClass(), "playCount", 0);
        setIntField(term4212807, term4212807.getClass(), "multiPlayCount", 0);
        setIntField(term4212807, term4212807.getClass(), "playerRating", 0);
        setIntField(term4212807, term4212807.getClass(), "highestRating", 0);
        setIntField(term4212807, term4212807.getClass(), "nameplateId", 0);
        setIntField(term4212807, term4212807.getClass(), "frameId", 0);
        setIntField(term4212807, term4212807.getClass(), "characterId", 0);
        setIntField(term4212807, term4212807.getClass(), "trophyId", 0);
        setIntField(term4212807, term4212807.getClass(), "playedTutorialBit", 0);
        setIntField(term4212807, term4212807.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term4212807, term4212807.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term4212807, term4212807.getClass(), "totalMapNum", 0);
        setLongField(term4212807, term4212807.getClass(), "totalHiScore", 0L);
        setLongField(term4212807, term4212807.getClass(), "totalBasicHighScore", 0L);
        setLongField(term4212807, term4212807.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term4212807, term4212807.getClass(), "totalExpertHighScore", 0L);
        setLongField(term4212807, term4212807.getClass(), "totalMasterHighScore", 0L);
        setLongField(term4212807, term4212807.getClass(), "totalUltimaHighScore", 0L);
        setField(term4212807, term4212807.getClass(), "eventWatchedDate", null);
        setIntField(term4212807, term4212807.getClass(), "friendCount", 0);
        setField(term4212807, term4212807.getClass(), "firstGameId", null);
        setField(term4212807, term4212807.getClass(), "firstRomVersion", null);
        setField(term4212807, term4212807.getClass(), "firstDataVersion", null);
        setField(term4212807, term4212807.getClass(), "firstPlayDate", null);
        setField(term4212807, term4212807.getClass(), "lastGameId", null);
        setField(term4212807, term4212807.getClass(), "lastRomVersion", null);
        setField(term4212807, term4212807.getClass(), "lastDataVersion", null);
        setField(term4212807, term4212807.getClass(), "lastLoginDate", null);
        setField(term4212807, term4212807.getClass(), "lastPlayDate", null);
        setIntField(term4212807, term4212807.getClass(), "lastPlaceId", 0);
        setField(term4212807, term4212807.getClass(), "lastPlaceName", null);
        setField(term4212807, term4212807.getClass(), "lastRegionId", null);
        setField(term4212807, term4212807.getClass(), "lastRegionName", null);
        setField(term4212807, term4212807.getClass(), "lastAllNetId", null);
        setField(term4212807, term4212807.getClass(), "lastClientId", null);
        setField(term4212807, term4212807.getClass(), "lastCountryCode", null);
        setField(term4212807, term4212807.getClass(), "userNameEx", null);
        setField(term4212807, term4212807.getClass(), "compatibleCmVersion", null);
        setIntField(term4212807, term4212807.getClass(), "medal", 0);
        setIntField(term4212807, term4212807.getClass(), "mapIconId", 0);
        setIntField(term4212807, term4212807.getClass(), "voiceId", 0);
        setIntField(term4212807, term4212807.getClass(), "avatarWear", 0);
        setIntField(term4212807, term4212807.getClass(), "avatarHead", 0);
        setIntField(term4212807, term4212807.getClass(), "avatarFace", 0);
        setIntField(term4212807, term4212807.getClass(), "avatarSkin", 0);
        setIntField(term4212807, term4212807.getClass(), "avatarItem", 0);
        setIntField(term4212807, term4212807.getClass(), "avatarFront", 0);
        setIntField(term4212807, term4212807.getClass(), "avatarBack", 0);
        setIntField(term4212807, term4212807.getClass(), "classEmblemBase", 0);
        setIntField(term4212807, term4212807.getClass(), "classEmblemMedal", 0);
        setIntField(term4212807, term4212807.getClass(), "stockedGridCount", 0);
        setIntField(term4212807, term4212807.getClass(), "exMapLoopCount", 0);
        setIntField(term4212807, term4212807.getClass(), "netBattlePlayCount", 0);
        setIntField(term4212807, term4212807.getClass(), "netBattleWinCount", 0);
        setIntField(term4212807, term4212807.getClass(), "netBattleLoseCount", 0);
        setIntField(term4212807, term4212807.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term4212807, term4212807.getClass(), "charaIllustId", 0);
        setIntField(term4212807, term4212807.getClass(), "skillId", 0);
        setIntField(term4212807, term4212807.getClass(), "overPowerPoint", 0);
        setIntField(term4212807, term4212807.getClass(), "overPowerRate", 0);
        setIntField(term4212807, term4212807.getClass(), "overPowerLowerRank", 0);
        setIntField(term4212807, term4212807.getClass(), "avatarPoint", 0);
        setIntField(term4212807, term4212807.getClass(), "battleRankId", 0);
        setIntField(term4212807, term4212807.getClass(), "battleRankPoint", 0);
        setIntField(term4212807, term4212807.getClass(), "eliteRankPoint", 0);
        setIntField(term4212807, term4212807.getClass(), "netBattle1stCount", 0);
        setIntField(term4212807, term4212807.getClass(), "netBattle2ndCount", 0);
        setIntField(term4212807, term4212807.getClass(), "netBattle3rdCount", 0);
        setIntField(term4212807, term4212807.getClass(), "netBattle4thCount", 0);
        setIntField(term4212807, term4212807.getClass(), "netBattleCorrection", 0);
        setIntField(term4212807, term4212807.getClass(), "netBattleErrCnt", 0);
        setIntField(term4212807, term4212807.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term4212807, term4212807.getClass(), "battleRewardStatus", 0);
        setIntField(term4212807, term4212807.getClass(), "battleRewardIndex", 0);
        setIntField(term4212807, term4212807.getClass(), "battleRewardCount", 0);
        setIntField(term4212807, term4212807.getClass(), "ext1", 0);
        setIntField(term4212807, term4212807.getClass(), "ext2", 0);
        setIntField(term4212807, term4212807.getClass(), "ext3", 0);
        setIntField(term4212807, term4212807.getClass(), "ext4", 0);
        setIntField(term4212807, term4212807.getClass(), "ext5", 0);
        setIntField(term4212807, term4212807.getClass(), "ext6", 0);
        setIntField(term4212807, term4212807.getClass(), "ext7", 0);
        setIntField(term4212807, term4212807.getClass(), "ext8", 0);
        setIntField(term4212807, term4212807.getClass(), "ext9", 0);
        setIntField(term4212807, term4212807.getClass(), "ext10", 0);
        setField(term4212807, term4212807.getClass(), "extStr1", null);
        setField(term4212807, term4212807.getClass(), "extStr2", null);
        setLongField(term4212807, term4212807.getClass(), "extLong1", 0L);
        setLongField(term4212807, term4212807.getClass(), "extLong2", 0L);
        setField(term4212807, term4212807.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term4212807, term4212807.getClass(), "isNetBattleHost", false);
        setIntField(term4212807, term4212807.getClass(), "netBattleEndState", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayerRating", argTypes, term4212807, args);
    }

};


