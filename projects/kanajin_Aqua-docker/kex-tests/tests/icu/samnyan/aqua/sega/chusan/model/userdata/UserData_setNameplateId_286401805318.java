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

public class UserData_setNameplateId_286401805318 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term286078;
     Object term286155;

    public UserData_setNameplateId_286401805318() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term286078 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term286078, term286078.getClass(), "id", 0L);
        setField(term286078, term286078.getClass(), "card", null);
        setField(term286078, term286078.getClass(), "userName", null);
        setIntField(term286078, term286078.getClass(), "level", 0);
        setIntField(term286078, term286078.getClass(), "reincarnationNum", 0);
        setField(term286078, term286078.getClass(), "exp", null);
        setLongField(term286078, term286078.getClass(), "point", 0L);
        setLongField(term286078, term286078.getClass(), "totalPoint", 0L);
        setIntField(term286078, term286078.getClass(), "playCount", 0);
        setIntField(term286078, term286078.getClass(), "multiPlayCount", 0);
        setIntField(term286078, term286078.getClass(), "playerRating", 0);
        setIntField(term286078, term286078.getClass(), "highestRating", 0);
        setIntField(term286078, term286078.getClass(), "nameplateId", 0);
        setIntField(term286078, term286078.getClass(), "frameId", 0);
        setIntField(term286078, term286078.getClass(), "characterId", 0);
        setIntField(term286078, term286078.getClass(), "trophyId", 0);
        setIntField(term286078, term286078.getClass(), "playedTutorialBit", 0);
        setIntField(term286078, term286078.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term286078, term286078.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term286078, term286078.getClass(), "totalMapNum", 0);
        setLongField(term286078, term286078.getClass(), "totalHiScore", 0L);
        setLongField(term286078, term286078.getClass(), "totalBasicHighScore", 0L);
        setLongField(term286078, term286078.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term286078, term286078.getClass(), "totalExpertHighScore", 0L);
        setLongField(term286078, term286078.getClass(), "totalMasterHighScore", 0L);
        setLongField(term286078, term286078.getClass(), "totalUltimaHighScore", 0L);
        setField(term286078, term286078.getClass(), "eventWatchedDate", null);
        setIntField(term286078, term286078.getClass(), "friendCount", 0);
        setField(term286078, term286078.getClass(), "firstGameId", null);
        setField(term286078, term286078.getClass(), "firstRomVersion", null);
        setField(term286078, term286078.getClass(), "firstDataVersion", null);
        setField(term286078, term286078.getClass(), "firstPlayDate", null);
        setField(term286078, term286078.getClass(), "lastGameId", null);
        setField(term286078, term286078.getClass(), "lastRomVersion", null);
        setField(term286078, term286078.getClass(), "lastDataVersion", null);
        setField(term286078, term286078.getClass(), "lastLoginDate", null);
        setField(term286078, term286078.getClass(), "lastPlayDate", null);
        setIntField(term286078, term286078.getClass(), "lastPlaceId", 0);
        setField(term286078, term286078.getClass(), "lastPlaceName", null);
        setField(term286078, term286078.getClass(), "lastRegionId", null);
        setField(term286078, term286078.getClass(), "lastRegionName", null);
        setField(term286078, term286078.getClass(), "lastAllNetId", null);
        setField(term286078, term286078.getClass(), "lastClientId", null);
        setField(term286078, term286078.getClass(), "lastCountryCode", null);
        setField(term286078, term286078.getClass(), "userNameEx", null);
        setField(term286078, term286078.getClass(), "compatibleCmVersion", null);
        setIntField(term286078, term286078.getClass(), "medal", 0);
        setIntField(term286078, term286078.getClass(), "mapIconId", 0);
        setIntField(term286078, term286078.getClass(), "voiceId", 0);
        setIntField(term286078, term286078.getClass(), "avatarWear", 0);
        setIntField(term286078, term286078.getClass(), "avatarHead", 0);
        setIntField(term286078, term286078.getClass(), "avatarFace", 0);
        setIntField(term286078, term286078.getClass(), "avatarSkin", 0);
        setIntField(term286078, term286078.getClass(), "avatarItem", 0);
        setIntField(term286078, term286078.getClass(), "avatarFront", 0);
        setIntField(term286078, term286078.getClass(), "avatarBack", 0);
        setIntField(term286078, term286078.getClass(), "classEmblemBase", 0);
        setIntField(term286078, term286078.getClass(), "classEmblemMedal", 0);
        setIntField(term286078, term286078.getClass(), "stockedGridCount", 0);
        setIntField(term286078, term286078.getClass(), "exMapLoopCount", 0);
        setIntField(term286078, term286078.getClass(), "netBattlePlayCount", 0);
        setIntField(term286078, term286078.getClass(), "netBattleWinCount", 0);
        setIntField(term286078, term286078.getClass(), "netBattleLoseCount", 0);
        setIntField(term286078, term286078.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term286078, term286078.getClass(), "charaIllustId", 0);
        setIntField(term286078, term286078.getClass(), "skillId", 0);
        setIntField(term286078, term286078.getClass(), "overPowerPoint", 0);
        setIntField(term286078, term286078.getClass(), "overPowerRate", 0);
        setIntField(term286078, term286078.getClass(), "overPowerLowerRank", 0);
        setIntField(term286078, term286078.getClass(), "avatarPoint", 0);
        setIntField(term286078, term286078.getClass(), "battleRankId", 0);
        setIntField(term286078, term286078.getClass(), "battleRankPoint", 0);
        setIntField(term286078, term286078.getClass(), "eliteRankPoint", 0);
        setIntField(term286078, term286078.getClass(), "netBattle1stCount", 0);
        setIntField(term286078, term286078.getClass(), "netBattle2ndCount", 0);
        setIntField(term286078, term286078.getClass(), "netBattle3rdCount", 0);
        setIntField(term286078, term286078.getClass(), "netBattle4thCount", 0);
        setIntField(term286078, term286078.getClass(), "netBattleCorrection", 0);
        setIntField(term286078, term286078.getClass(), "netBattleErrCnt", 0);
        setIntField(term286078, term286078.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term286078, term286078.getClass(), "battleRewardStatus", 0);
        setIntField(term286078, term286078.getClass(), "battleRewardIndex", 0);
        setIntField(term286078, term286078.getClass(), "battleRewardCount", 0);
        setIntField(term286078, term286078.getClass(), "ext1", 0);
        setIntField(term286078, term286078.getClass(), "ext2", 0);
        setIntField(term286078, term286078.getClass(), "ext3", 0);
        setIntField(term286078, term286078.getClass(), "ext4", 0);
        setIntField(term286078, term286078.getClass(), "ext5", 0);
        setIntField(term286078, term286078.getClass(), "ext6", 0);
        setIntField(term286078, term286078.getClass(), "ext7", 0);
        setIntField(term286078, term286078.getClass(), "ext8", 0);
        setIntField(term286078, term286078.getClass(), "ext9", 0);
        setIntField(term286078, term286078.getClass(), "ext10", 0);
        setField(term286078, term286078.getClass(), "extStr1", null);
        setField(term286078, term286078.getClass(), "extStr2", null);
        setLongField(term286078, term286078.getClass(), "extLong1", 0L);
        setLongField(term286078, term286078.getClass(), "extLong2", 0L);
        setField(term286078, term286078.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term286078, term286078.getClass(), "isNetBattleHost", false);
        setIntField(term286078, term286078.getClass(), "netBattleEndState", 0);
        term286155 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term286155;
        callMethod(klass, "setNameplateId", argTypes, term286078, args);
    }

};


